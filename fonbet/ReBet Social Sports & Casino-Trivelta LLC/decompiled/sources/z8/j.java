package z8;

import com.facebook.soloader.B;
import com.facebook.soloader.C;
import com.facebook.soloader.C3111c;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import java.io.IOException;

/* loaded from: classes2.dex */
public class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public int f68639a;

    public j(int i10) {
        this.f68639a = i10;
    }

    @Override // z8.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        C c10 = (C) unsatisfiedLinkError;
        String a10 = c10.a();
        String message = c10.getMessage();
        if (a10 == null) {
            p.b("SoLoader", "No so name provided in ULE, cannot recover");
            return false;
        }
        if (c10 instanceof B) {
            if ((this.f68639a & 1) == 0) {
                return false;
            }
            c(c10, a10);
            return d(eArr, a10, 0);
        }
        if (message == null || !(message.contains("/app/") || message.contains("/mnt/"))) {
            return false;
        }
        c(c10, a10);
        return b(eArr, a10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r8 = r7.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r2 >= r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r0 = r7[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if ((r0 instanceof com.facebook.soloader.C3114f) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if ((r0 instanceof com.facebook.soloader.C3111c) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        ((com.facebook.soloader.C3114f) r0).h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        com.facebook.soloader.p.c("SoLoader", "Encountered an exception while reunpacking BackupSoSource " + r4.c() + " for library " + r8 + ": ", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        r4 = (com.facebook.soloader.C3111c) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        com.facebook.soloader.p.b("SoLoader", "Preparing BackupSoSource for the first time " + r4.c());
        r4.e(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(E[] eArr, String str) {
        int length = eArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            E e10 = eArr[i11];
            if (e10 instanceof C3111c) {
                break;
            }
            i11++;
        }
    }

    public final void c(Error error, String str) {
        p.b("SoLoader", "Reunpacking BackupSoSources due to " + error + ", retrying for specific library " + str);
    }

    public final boolean d(E[] eArr, String str, int i10) {
        try {
            for (E e10 : eArr) {
                if ((e10 instanceof C3111c) && ((C3111c) e10).x(str, i10)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e11) {
            p.b("SoLoader", "Failed to run recovery for backup so source due to: " + e11);
            return false;
        }
    }
}
