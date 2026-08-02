package V5;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.P;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r5.C6208b;
import r5.InterfaceC6207a;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final File f12514a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6207a f12515b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12516c;

    /* renamed from: d, reason: collision with root package name */
    public int f12517d;

    /* renamed from: V5.a$a, reason: collision with other inner class name */
    public static final class C0261a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12518n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Bitmap f12520p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f12521q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0261a(Bitmap bitmap, int i10, Continuation continuation) {
            super(2, continuation);
            this.f12520p = bitmap;
            this.f12521q = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new C0261a(this.f12520p, this.f12521q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0261a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12518n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = a.this.f12516c;
            a aVar = a.this;
            Bitmap bitmap = this.f12520p;
            int i10 = this.f12521q;
            synchronized (obj2) {
                E5.b bVar = E5.b.f3006a;
                bVar.a("Saving frame");
                if (!aVar.f12514a.exists() && !aVar.f12514a.mkdirs()) {
                    bVar.b("Failed to create frames directory: " + aVar.f12514a.getPath());
                    return null;
                }
                long a10 = aVar.g().a();
                int i11 = aVar.f12517d;
                aVar.f12517d = i11 + 1;
                File file = new File(aVar.f12514a, a10 + "_" + i11 + "_" + UUID.randomUUID() + ".jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, fileOutputStream);
                        fileOutputStream.flush();
                        CloseableKt.closeFinally(fileOutputStream, null);
                        return file;
                    } finally {
                    }
                } catch (IOException e10) {
                    E5.b.f3006a.c("Error saving frame", e10);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    return null;
                }
            }
        }
    }

    public a(File frameDirectory, InterfaceC6207a clock) {
        Intrinsics.checkNotNullParameter(frameDirectory, "frameDirectory");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f12514a = frameDirectory;
        this.f12515b = clock;
        this.f12516c = new Object();
    }

    @Override // V5.b
    public Object a(Bitmap bitmap, int i10, Continuation continuation) {
        return AbstractC1455i.g(C1452g0.b(), new C0261a(bitmap, i10, null), continuation);
    }

    public Object f(Continuation continuation) {
        synchronized (this.f12516c) {
            try {
                if (this.f12514a.exists() && this.f12514a.isDirectory()) {
                    E5.b bVar = E5.b.f3006a;
                    bVar.a("Cleaning frames directory: " + this.f12514a.getPath());
                    File[] listFiles = this.f12514a.listFiles();
                    if (listFiles != null && listFiles.length != 0) {
                        for (File file : listFiles) {
                            try {
                                if (file.delete()) {
                                    E5.b.f3006a.a("Deleted file: " + file.getPath());
                                } else {
                                    E5.b.f3006a.k("Failed to delete file: " + file.getPath());
                                }
                            } catch (Exception e10) {
                                E5.b.f3006a.c("Error deleting file: " + file.getPath(), e10);
                            }
                        }
                        E5.b.f3006a.f("Finished cleaning frames directory: " + this.f12514a.getPath());
                        return Unit.INSTANCE;
                    }
                    bVar.f("Frames directory is already empty: " + this.f12514a.getPath());
                    return Unit.INSTANCE;
                }
                E5.b.f3006a.k("Frames directory does not exist or is not a directory: " + this.f12514a.getPath());
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public InterfaceC6207a g() {
        return this.f12515b;
    }

    public Object h(Continuation continuation) {
        if (!this.f12514a.exists()) {
            this.f12514a.mkdirs();
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(File file, InterfaceC6207a interfaceC6207a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? new C6208b() : interfaceC6207a);
    }
}
