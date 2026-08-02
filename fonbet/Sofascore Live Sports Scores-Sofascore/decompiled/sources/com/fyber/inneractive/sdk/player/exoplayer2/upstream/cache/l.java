package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import defpackage.zzl;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l {
    public final File a;
    public final j b;
    public final i d;
    public a f;
    public final HashMap c = new HashMap();
    public final HashMap e = new HashMap();

    public l(File file, j jVar) {
        this.a = file;
        this.b = jVar;
        this.d = new i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new k(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized m a(String str, long j) {
        String str2;
        m a;
        try {
            a aVar = this.f;
            if (aVar != null) {
                throw aVar;
            }
            h hVar = (h) this.d.a.get(str);
            if (hVar != null) {
                str2 = str;
                while (true) {
                    a = hVar.a(j);
                    if (!a.d || a.e.length() == a.c) {
                        break;
                    }
                    a();
                }
            } else {
                str2 = str;
                a = new m(str2, j, -1L, C.TIME_UNSET, null);
            }
            if (!a.d) {
                if (this.c.containsKey(str2)) {
                    return null;
                }
                this.c.put(str2, a);
                return a;
            }
            h hVar2 = (h) this.d.a.get(str2);
            if (!hVar2.c.remove(a)) {
                throw new IllegalStateException();
            }
            int i = hVar2.a;
            if (!a.d) {
                throw new IllegalStateException();
            }
            long currentTimeMillis = System.currentTimeMillis();
            File parentFile = a.e.getParentFile();
            long j2 = a.b;
            Pattern pattern = m.g;
            File file = new File(parentFile, i + "." + j2 + "." + currentTimeMillis + ".v3.exo");
            m mVar = new m(a.a, a.b, a.c, currentTimeMillis, file);
            if (!a.e.renameTo(file)) {
                throw new a("Renaming of " + a.e + " to " + file + " failed.");
            }
            hVar2.c.add(mVar);
            ArrayList arrayList = (ArrayList) this.e.get(a.a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    j jVar = (j) arrayList.get(size);
                    jVar.a.remove(a);
                    jVar.b -= a.c;
                    jVar.a.add(mVar);
                    jVar.b += mVar.c;
                    jVar.a(this, 0L);
                }
            }
            j jVar2 = this.b;
            jVar2.a.remove(a);
            jVar2.b -= a.c;
            jVar2.a.add(mVar);
            jVar2.b += mVar.c;
            jVar2.a(this, 0L);
            return mVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(m mVar) {
        if (mVar != this.c.remove(mVar.a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c8, code lost:
    
        if (r4 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(l lVar) {
        DataInputStream dataInputStream;
        File[] listFiles;
        BufferedInputStream bufferedInputStream;
        if (!lVar.a.exists()) {
            lVar.a.mkdirs();
            return;
        }
        i iVar = lVar.d;
        if (!iVar.f) {
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(iVar.c.a());
                dataInputStream = new DataInputStream(bufferedInputStream);
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            z.a(dataInputStream);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                } catch (IOException unused2) {
                    if (dataInputStream != null) {
                        z.a(dataInputStream);
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = iVar.c;
                    cVar.a.delete();
                    cVar.b.delete();
                    iVar.a.clear();
                    iVar.b.clear();
                    listFiles = lVar.a.listFiles();
                    if (listFiles != null) {
                    }
                }
            } catch (FileNotFoundException unused3) {
                dataInputStream = null;
            } catch (IOException unused4) {
                dataInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (dataInputStream.readInt() == 1) {
                int readInt = dataInputStream.readInt() & 1;
                Cipher cipher = iVar.d;
                if (readInt != 0) {
                    if (cipher != null) {
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            iVar.d.init(2, iVar.e, new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, iVar.d));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                } else if (cipher != null) {
                    iVar.f = true;
                }
                try {
                    int readInt2 = dataInputStream.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        int readInt3 = dataInputStream.readInt();
                        String readUTF = dataInputStream.readUTF();
                        h hVar = new h(readInt3, readUTF, dataInputStream.readLong());
                        iVar.a.put(readUTF, hVar);
                        iVar.b.put(readInt3, readUTF);
                        int hashCode = readUTF.hashCode();
                        long j = hVar.d;
                        i += ((hashCode + (readInt3 * 31)) * 31) + ((int) (j ^ (j >>> 32)));
                    }
                    if (dataInputStream.readInt() == i) {
                        z.a(dataInputStream);
                        listFiles = lVar.a.listFiles();
                        if (listFiles != null) {
                            return;
                        }
                        for (File file : listFiles) {
                            if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                                m a = file.length() > 0 ? m.a(file, lVar.d) : null;
                                if (a != null) {
                                    lVar.a(a);
                                } else {
                                    file.delete();
                                }
                            }
                        }
                        lVar.d.a();
                        lVar.d.b();
                        return;
                    }
                    z.a(dataInputStream);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar2 = iVar.c;
                    cVar2.a.delete();
                    cVar2.b.delete();
                    iVar.a.clear();
                    iVar.b.clear();
                    listFiles = lVar.a.listFiles();
                    if (listFiles != null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream2 = dataInputStream;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                    }
                    throw th;
                }
            }
            z.a(dataInputStream);
            com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar22 = iVar.c;
            cVar22.a.delete();
            cVar22.b.delete();
            iVar.a.clear();
            iVar.b.clear();
            listFiles = lVar.a.listFiles();
            if (listFiles != null) {
            }
        } else {
            zzl.s();
        }
    }

    public final void a(m mVar) {
        i iVar = this.d;
        String str = mVar.a;
        h hVar = (h) iVar.a.get(str);
        if (hVar == null) {
            hVar = iVar.a(str, -1L);
        }
        hVar.c.add(mVar);
        ArrayList arrayList = (ArrayList) this.e.get(mVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.a.add(mVar);
                jVar.b += mVar.c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.b;
        jVar2.a.add(mVar);
        jVar2.b += mVar.c;
        jVar2.a(this, 0L);
    }

    public final void a(g gVar, boolean z) {
        h hVar = (h) this.d.a.get(gVar.a);
        if (hVar == null || !hVar.c.remove(gVar)) {
            return;
        }
        gVar.e.delete();
        if (z && hVar.c.isEmpty()) {
            i iVar = this.d;
            h hVar2 = (h) iVar.a.remove(hVar.b);
            if (hVar2 != null) {
                if (hVar2.c.isEmpty()) {
                    iVar.b.remove(hVar2.a);
                    iVar.f = true;
                } else {
                    zzl.s();
                    return;
                }
            }
            this.d.b();
        }
        ArrayList arrayList = (ArrayList) this.e.get(gVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.a.remove(gVar);
                jVar.b -= gVar.c;
            }
        }
        j jVar2 = this.b;
        jVar2.a.remove(gVar);
        jVar2.b -= gVar.c;
    }

    public final void a() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.d.a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((h) it.next()).c.iterator();
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                if (gVar.e.length() != gVar.c) {
                    linkedList.add(gVar);
                }
            }
        }
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            a((g) it3.next(), false);
        }
        this.d.a();
        this.d.b();
    }

    public final synchronized long a(String str) {
        h hVar;
        hVar = (h) this.d.a.get(str);
        return hVar == null ? -1L : hVar.d;
    }
}
