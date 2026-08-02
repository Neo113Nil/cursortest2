package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Jd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f12429a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f12430b = C0353na.k().w().d();

    /* renamed from: c, reason: collision with root package name */
    public final Md f12431c;

    public Jd(@NotNull Context context, @NotNull Sg sg2, @NotNull Function1<? super String, Unit> function1, @NotNull Rd rd2, @NotNull EnumC0047bb enumC0047bb, @NotNull String str) {
        this.f12429a = function1;
        this.f12431c = new Md(context, sg2, rd2, enumC0047bb);
    }

    public static final void a(Jd jd2, NativeCrash nativeCrash, File file) {
        jd2.f12429a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(@NotNull final NativeCrash nativeCrash) {
        G0 g02;
        Z9 z92;
        try {
            NativeCrashSource nativeCrashSource = nativeCrash.getIo.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY java.lang.String();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            H0 a7 = I0.a(nativeCrash.getMetadata());
            Intrinsics.checkNotNull(a7);
            g02 = new G0(nativeCrashSource, handlerVersion, str, dumpFile, creationTime, a7);
        } catch (Throwable unused) {
            g02 = null;
        }
        if (g02 == null) {
            this.f12429a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(g02.f12250f.f12293a).info("Detected native crash with uuid = " + g02.f12247c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f12430b;
        Md md2 = this.f12431c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.cp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Jd.a(Jd.this, nativeCrash, (File) obj);
            }
        };
        md2.getClass();
        Fd fd2 = new Fd(new Hd(g02.f12245a, g02.f12246b), md2.f12589f);
        Cd cd2 = new Cd(md2.f12585b, g02.f12250f, new Ld(g02, md2.f12587d));
        C0020aa c0020aa = md2.f12588e;
        String str2 = g02.f12248d;
        c0020aa.getClass();
        File file = new File(str2);
        Context context = md2.f12584a;
        if (Z9.f13281c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(Z9.class)) {
                try {
                    if (Z9.f13281c == null) {
                        Z9.f13281c = new Z9(context);
                    }
                    Unit unit = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Z9 z93 = Z9.f13281c;
        if (z93 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            z92 = null;
        } else {
            z92 = z93;
        }
        iHandlerExecutor.execute(new Tf(file, fd2, consumer, cd2, z92, md2.f12586c.a(g02)));
    }
}
