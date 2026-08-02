package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import xsna.ho8;
import xsna.vu5;

/* loaded from: classes12.dex */
public class DirectorySoSource extends SoSource {
    public static final int ON_LD_LIBRARY_PATH = 2;
    public static final int RESOLVE_DEPENDENCIES = 1;
    protected final List<String> denyList;
    protected int flags;
    protected final File soDirectory;

    public DirectorySoSource(File file, int i) {
        this(file, i, new String[0]);
    }

    @Override // com.facebook.soloader.SoSource
    public void addToLdLibraryPath(Collection<String> collection) {
        try {
            collection.add(this.soDirectory.getCanonicalPath());
        } catch (IOException e) {
            LogUtil.e(SoLoader.TAG, "Failed to get canonical path for " + this.soDirectory.getName() + " due to " + e.toString() + ", falling to the absolute one");
            collection.add(this.soDirectory.getAbsolutePath());
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getLibraryDependencies(String str) throws IOException {
        File soFileByName = getSoFileByName(str);
        if (soFileByName == null) {
            return null;
        }
        ElfFileChannel elfFileChannel = new ElfFileChannel(soFileByName);
        try {
            String[] dependencies = NativeDeps.getDependencies(str, elfFileChannel);
            elfFileChannel.close();
            return dependencies;
        } catch (Throwable th) {
            try {
                elfFileChannel.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String getLibraryPath(String str) throws IOException {
        File soFileByName = getSoFileByName(str);
        if (soFileByName == null) {
            return null;
        }
        return soFileByName.getCanonicalPath();
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.SoSource
    public File getSoFileByName(String str) throws IOException {
        File file = new File(this.soDirectory, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return loadLibraryFrom(str, i, this.soDirectory, threadPolicy);
    }

    public int loadLibraryFrom(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.sSoFileLoader == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.denyList.contains(str)) {
            StringBuilder b = ho8.b(str, " is on the denyList, skip loading from ");
            b.append(file.getCanonicalPath());
            LogUtil.d(SoLoader.TAG, b.toString());
            return 0;
        }
        File soFileByName = getSoFileByName(str);
        if (soFileByName == null) {
            StringBuilder b2 = ho8.b(str, " file not found on ");
            b2.append(file.getCanonicalPath());
            LogUtil.v(SoLoader.TAG, b2.toString());
            return 0;
        }
        String canonicalPath = soFileByName.getCanonicalPath();
        LogUtil.d(SoLoader.TAG, str + " file found at " + canonicalPath);
        if ((i & 1) != 0 && (this.flags & 2) != 0) {
            LogUtil.d(SoLoader.TAG, str + " loaded implicitly");
            return 2;
        }
        if ((this.flags & 1) != 0) {
            ElfFileChannel elfFileChannel = new ElfFileChannel(soFileByName);
            try {
                NativeDeps.loadDependencies(str, elfFileChannel, i, threadPolicy);
                elfFileChannel.close();
            } catch (Throwable th) {
                try {
                    elfFileChannel.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            LogUtil.d(SoLoader.TAG, "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.sSoFileLoader.load(canonicalPath, i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            throw SoLoaderULErrorFactory.create(str, e);
        }
    }

    public void setExplicitDependencyResolution() {
        this.flags |= 1;
    }

    @Override // com.facebook.soloader.SoSource
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.soDirectory.getCanonicalPath());
        } catch (IOException unused) {
            name = this.soDirectory.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return vu5.b(sb, this.flags, ']');
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) throws IOException {
        return getSoFileByName(str);
    }

    public DirectorySoSource(File file, int i, String[] strArr) {
        this.soDirectory = file;
        this.flags = i;
        this.denyList = Arrays.asList(strArr);
    }
}
