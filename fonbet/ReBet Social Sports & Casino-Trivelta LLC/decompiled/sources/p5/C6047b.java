package p5;

import L5.ScreenshotContext;
import Q5.ViewContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6047b {

    /* renamed from: a, reason: collision with root package name */
    public final String f63040a;

    /* renamed from: b, reason: collision with root package name */
    public final Q5.b f63041b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewContext f63042c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f63043d;

    /* renamed from: e, reason: collision with root package name */
    public final ScreenshotContext f63044e;

    /* renamed from: f, reason: collision with root package name */
    public final String f63045f;

    /* renamed from: g, reason: collision with root package name */
    public final String f63046g;

    public C6047b(String eventType, Q5.b severity, ViewContext viewContext, Long l10, ScreenshotContext screenshotContext, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(severity, "severity");
        this.f63040a = eventType;
        this.f63041b = severity;
        this.f63042c = viewContext;
        this.f63043d = l10;
        this.f63044e = screenshotContext;
        this.f63045f = str;
        this.f63046g = str2;
    }

    public final String a() {
        return this.f63040a;
    }

    public final ScreenshotContext b() {
        return this.f63044e;
    }

    public final Q5.b c() {
        return this.f63041b;
    }

    public final String d() {
        return this.f63046g;
    }

    public final Long e() {
        return this.f63043d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.coralogix.android.sdk.internal.features.opentelemetry.span_factory.SpanDetails");
        C6047b c6047b = (C6047b) obj;
        return Intrinsics.areEqual(this.f63043d, c6047b.f63043d) && Intrinsics.areEqual(this.f63040a, c6047b.f63040a) && Intrinsics.areEqual(this.f63041b, c6047b.f63041b) && Intrinsics.areEqual(this.f63042c, c6047b.f63042c) && Intrinsics.areEqual(this.f63044e, c6047b.f63044e) && Intrinsics.areEqual(this.f63045f, c6047b.f63045f) && Intrinsics.areEqual(this.f63046g, c6047b.f63046g);
    }

    public final String f() {
        return this.f63045f;
    }

    public final ViewContext g() {
        return this.f63042c;
    }

    public int hashCode() {
        Long l10 = this.f63043d;
        int hashCode = (((((l10 != null ? l10.hashCode() : 0) * 31) + this.f63040a.hashCode()) * 31) + this.f63041b.hashCode()) * 31;
        ViewContext viewContext = this.f63042c;
        int hashCode2 = (hashCode + (viewContext != null ? viewContext.hashCode() : 0)) * 31;
        ScreenshotContext screenshotContext = this.f63044e;
        int hashCode3 = (hashCode2 + (screenshotContext != null ? screenshotContext.hashCode() : 0)) * 31;
        String str = this.f63045f;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f63046g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ C6047b(String str, Q5.b bVar, ViewContext viewContext, Long l10, ScreenshotContext screenshotContext, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, (i10 & 4) != 0 ? null : viewContext, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : screenshotContext, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3);
    }
}
