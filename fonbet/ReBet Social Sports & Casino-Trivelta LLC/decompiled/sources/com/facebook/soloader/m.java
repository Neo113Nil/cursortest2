package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.G;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class m extends G {

    /* renamed from: e, reason: collision with root package name */
    public final File f31606e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31607f;

    public static final class a extends G.c implements Comparable {

        /* renamed from: c, reason: collision with root package name */
        public final ZipEntry f31608c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31609d;

        public a(String str, ZipEntry zipEntry, int i10) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f31608c = zipEntry;
            this.f31609d = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f31563a.compareTo(aVar.f31563a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f31608c.equals(aVar.f31608c) && this.f31609d == aVar.f31609d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f31609d * 31) + this.f31608c.hashCode();
        }
    }

    public class b extends G.e {

        /* renamed from: a, reason: collision with root package name */
        public final ZipFile f31610a;

        /* renamed from: b, reason: collision with root package name */
        public final G f31611b;
        protected a[] mDsos;

        public b(G g10) {
            this.f31610a = new ZipFile(m.this.f31606e);
            this.f31611b = g10;
        }

        public a[] B() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(m.this.f31607f);
            String[] j10 = SysUtil.j();
            Enumeration<? extends ZipEntry> entries = this.f31610a.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = compile.matcher(nextElement.getName());
                if (matcher.matches()) {
                    int groupCount = matcher.groupCount();
                    String group = matcher.group(groupCount - 1);
                    String group2 = matcher.group(groupCount);
                    int e10 = SysUtil.e(j10, group);
                    if (e10 >= 0) {
                        linkedHashSet.add(group);
                        a aVar = (a) hashMap.get(group2);
                        if (aVar == null || e10 < aVar.f31609d) {
                            hashMap.put(group2, new a(group2, nextElement, e10));
                        }
                    }
                }
            }
            this.f31611b.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) hashMap.values().toArray(new a[hashMap.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        public a[] J() {
            a[] aVarArr = this.mDsos;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] B10 = B();
            this.mDsos = B10;
            return B10;
        }

        @Override // com.facebook.soloader.G.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f31610a.close();
        }

        @Override // com.facebook.soloader.G.e
        public final G.c[] k() {
            return J();
        }

        @Override // com.facebook.soloader.G.e
        public void r(File file) {
            byte[] bArr = new byte[32768];
            for (a aVar : J()) {
                InputStream inputStream = this.f31610a.getInputStream(aVar.f31608c);
                try {
                    G.d dVar = new G.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        d(dVar, bArr, file);
                        dVar.close();
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th2;
                }
            }
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f31606e = file;
        this.f31607f = str2;
    }

    @Override // com.facebook.soloader.C3114f, com.facebook.soloader.E
    public String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.G
    public G.e q() {
        return new b(this);
    }

    @Override // com.facebook.soloader.C3114f, com.facebook.soloader.E
    public String toString() {
        try {
            return this.f31606e.getCanonicalPath();
        } catch (IOException unused) {
            return this.f31606e.getName();
        }
    }

    public boolean v() {
        b bVar = new b(this);
        try {
            boolean z10 = bVar.B().length != 0;
            bVar.close();
            return z10;
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
