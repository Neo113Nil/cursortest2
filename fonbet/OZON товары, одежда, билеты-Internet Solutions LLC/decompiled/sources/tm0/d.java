package tm0;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.os.LocaleList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;
import um0.f;
import wm0.e;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f99584a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final um0.c f99585b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f99586c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99587d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private String f99588e;

    public d(@NotNull Context appContext, @NotNull um0.c deviceIdProvider, @NotNull f sessionProvider) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f99584a = appContext;
        this.f99585b = deviceIdProvider;
        this.f99586c = sessionProvider;
        this.f99587d = k.b(new c(this));
        this.f99588e = "";
    }

    public static final String a(d dVar) {
        LocaleList locales = dVar.f99584a.getResources().getConfiguration().getLocales();
        String language = locales.isEmpty() ? FraudMonInfo.UNKNOWN : locales.get(0).getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "appContext.resources.con…e\n            }\n        }");
        return language;
    }

    @NotNull
    public final e b() {
        return new e(this.f99585b.getDeviceId(), (String) this.f99587d.getValue(), this.f99586c.a(), this.f99588e);
    }

    public final void c(@NotNull String hashUserLoginId) {
        Intrinsics.checkNotNullParameter(hashUserLoginId, "hashUserLoginId");
        this.f99588e = hashUserLoginId;
    }
}
