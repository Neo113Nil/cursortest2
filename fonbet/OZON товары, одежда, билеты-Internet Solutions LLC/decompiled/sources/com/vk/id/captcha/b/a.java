package com.vk.id.captcha.b;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.os.Looper;
import com.vk.id.captcha.sensors.SensorsDataRepository;
import com.vk.id.captcha.sensors.SensorsDataRepositoryImpl;
import com.vk.id.captcha.web.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u000e8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0006\u0010\u0010R\u001e\u0010\n\u001a\u0006*\u00020\u00110\u00118\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017\"\u0004\b\b\u0010\u0018"}, d2 = {"Lcom/vk/id/captcha/b/a;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "b", "Landroid/content/Context;", "a", "Lcom/vk/id/captcha/c/e;", "c", "LSc/j;", "()Lcom/vk/id/captcha/c/e;", "e", "Lcom/vk/id/captcha/web/b;", "d", "()Lcom/vk/id/captcha/web/b;", "Landroid/os/Looper;", "Landroid/os/Looper;", "()Landroid/os/Looper;", "", "f", "Z", "()Z", "(Z)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f60514g;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Context a;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j e;

    @NotNull
    private final InterfaceC4008j d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Looper c;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/web/b;", "a", "()Lcom/vk/id/captcha/web/b;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.b.a$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<b> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(a.this.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/c/f;", "a", "()Lcom/vk/id/captcha/c/f;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.b.a$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<SensorsDataRepositoryImpl> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SensorsDataRepositoryImpl invoke() {
            SensorsDataRepositoryImpl.a aVar = SensorsDataRepositoryImpl.f60554a;
            return SensorsDataRepositoryImpl.a.a(a.this.a);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\n"}, d2 = {"Lcom/vk/id/captcha/b/a$a;", "", "Landroid/content/Context;", "p0", "", "a", "(Landroid/content/Context;)V", "Lcom/vk/id/captcha/b/a;", "g", "Lcom/vk/id/captcha/b/a;", "()Lcom/vk/id/captcha/b/a;", "b", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.b.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public static a a() {
            a aVar = a.f60514g;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("DI is not initialized!");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void a(@NotNull Context p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            if (a.f60514g == null) {
                synchronized (a.class) {
                    try {
                        if (a.f60514g == null) {
                            a.f60514g = new a(p02);
                        }
                        Unit unit = Unit.f71690a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.a = context;
        this.e = k.b(new AnonymousClass2());
        this.d = k.b(new AnonymousClass1());
        this.c = Looper.getMainLooper();
    }

    /* renamed from: c, reason: from getter */
    public final Looper getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @NotNull
    public final SensorsDataRepository a() {
        return (SensorsDataRepository) this.e.getValue();
    }

    @NotNull
    public final b b() {
        return (b) this.d.getValue();
    }

    public final void a(boolean z11) {
        this.b = true;
    }
}
