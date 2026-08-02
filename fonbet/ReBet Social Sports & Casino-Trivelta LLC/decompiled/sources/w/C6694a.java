package w;

import android.os.Bundle;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6694a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f67186a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f67187b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f67188c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f67189d;

    /* renamed from: w.a$a, reason: collision with other inner class name */
    public static final class C0945a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f67190a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f67191b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f67192c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f67193d;

        public C6694a a() {
            return new C6694a(this.f67190a, this.f67191b, this.f67192c, this.f67193d);
        }

        public C0945a b(int i10) {
            this.f67192c = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        public C0945a c(int i10) {
            this.f67193d = Integer.valueOf(i10);
            return this;
        }

        public C0945a d(int i10) {
            this.f67191b = Integer.valueOf(i10);
            return this;
        }

        public C0945a e(int i10) {
            this.f67190a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    public C6694a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f67186a = num;
        this.f67187b = num2;
        this.f67188c = num3;
        this.f67189d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f67186a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f67187b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f67188c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f67189d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
