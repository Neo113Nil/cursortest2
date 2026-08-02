package t2;

import android.content.Context;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import t2.C6407m;
import t2.E;
import t2.F;

/* loaded from: classes.dex */
public abstract class l1 {

    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ta.v f65398a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f65399b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f65400c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f65401d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Ta.v vVar, Context context, String str2, long j10) {
            super(str);
            this.f65398a = vVar;
            this.f65399b = context;
            this.f65400c = str2;
            this.f65401d = j10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f65398a.x(H0.a(this.f65399b, this.f65400c, this.f65401d));
            } catch (Exception e10) {
                this.f65398a.y(e10);
            }
        }
    }

    public class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ta.v f65402a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f65403b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f65404c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Ta.v vVar, File file, File file2) {
            super(str);
            this.f65402a = vVar;
            this.f65403b = file;
            this.f65404c = file2;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[Catch: IOException -> 0x0058, TRY_LEAVE, TryCatch #1 {IOException -> 0x0058, blocks: (B:31:0x0050, B:26:0x0055), top: B:30:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            FileOutputStream fileOutputStream;
            Throwable th2;
            FileInputStream fileInputStream;
            Exception e10;
            if (this.f65402a.isCancelled()) {
                return;
            }
            try {
                try {
                    fileInputStream = new FileInputStream(this.f65403b);
                    try {
                        fileOutputStream = new FileOutputStream(this.f65404c);
                        try {
                            try {
                                Sa.a.b(fileInputStream, fileOutputStream);
                                this.f65402a.x(null);
                                fileInputStream.close();
                                fileOutputStream.close();
                            } catch (Exception e11) {
                                e10 = e11;
                                this.f65402a.y(e10);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                    throw th2;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th2;
                        }
                    } catch (Exception e12) {
                        fileOutputStream = null;
                        e10 = e12;
                    } catch (Throwable th4) {
                        fileOutputStream = null;
                        th2 = th4;
                        if (fileInputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        throw th2;
                    }
                } catch (IOException unused2) {
                }
            } catch (Exception e13) {
                fileOutputStream = null;
                e10 = e13;
                fileInputStream = null;
            } catch (Throwable th5) {
                fileOutputStream = null;
                th2 = th5;
                fileInputStream = null;
            }
        }
    }

    public static final class c {
    }

    public static C6407m a(C6407m c6407m, boolean z10, boolean z11, c cVar) {
        C6407m.b a10 = c6407m.a();
        AbstractC3445z abstractC3445z = c6407m.f65405a;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < abstractC3445z.size(); i10++) {
            F f10 = (F) abstractC3445z.get(i10);
            AbstractC3445z abstractC3445z2 = f10.f65031a;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < abstractC3445z2.size(); i11++) {
                E e10 = (E) abstractC3445z2.get(i11);
                E.b a11 = e10.a();
                if (i11 == 0) {
                    a11.d(e10.f65013a.a().b(e10.f65013a.f24659f.a().j(e10.f65013a.f24659f.f24685a + e1.Z.J1(0L)).g()).a());
                }
                if (z10) {
                    a11.e(true);
                }
                if (z11) {
                    a11.f(true);
                }
                arrayList2.add(a11.a());
            }
            arrayList.add(new F.b(arrayList2).g(f10.f65032b).e());
        }
        a10.b(arrayList);
        return a10.a();
    }

    public static C6407m b(C6407m c6407m, long j10, long j11, long j12, boolean z10, boolean z11) {
        E e10 = (E) ((F) c6407m.f65405a.get(0)).f65031a.get(0);
        return c6407m.a().b(AbstractC3445z.u(new F.b(e10.a().d(e10.f65013a.a().b(new z.d.a().k(j10).i(j11).l(z10).g()).a()).b(j12).c(z11 ? new C6406l0(e10.f65019g.f65396a, AbstractC3445z.t()) : e10.f65019g).a()).e())).a();
    }

    public static Ta.o c(File file, File file2) {
        Ta.v A10 = Ta.v.A();
        new b("TransmuxTranscodeHelper:CopyFile", A10, file, file2).start();
        return A10;
    }

    public static C6407m d(C6407m c6407m, String str) {
        C6407m a10 = a((C6407m) AbstractC4134a.e(c6407m), false, true, null);
        C6407m.b a11 = a10.a();
        ArrayList arrayList = new ArrayList(a10.f65405a);
        arrayList.add(new F.b(new E.b(new z.c().j(str).a()).a()).e());
        a11.b(arrayList);
        a11.c(true);
        return a11.a();
    }

    public static Ta.o e(Context context, String str, long j10) {
        Ta.v A10 = Ta.v.A();
        new a("TransmuxTranscodeHelper:Mp4Info", A10, context, str, j10).start();
        return A10;
    }
}
