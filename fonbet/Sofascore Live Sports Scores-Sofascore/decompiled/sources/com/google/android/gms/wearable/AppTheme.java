package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.me4;
import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class AppTheme extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AppTheme> CREATOR = new zzc();
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public Icon f = new Icon();
    public Headline g = new Headline();
    public Description h = new Description();
    public CallToAction i = new CallToAction();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @ShowFirstParty
    public static class Builder {
        @ShowFirstParty
        public Builder() {
            new AppTheme();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AppTheme)) {
                return false;
            }
            AppTheme appTheme = (AppTheme) obj;
            int i = this.b;
            if (i == 0) {
                i = 1;
            }
            int i2 = appTheme.b;
            if (i2 == 0) {
                i2 = 1;
            }
            if (i != i2) {
                return false;
            }
            int i3 = this.a;
            if (i3 == 0) {
                i3 = 1;
            }
            int i4 = appTheme.a;
            if (i4 == 0) {
                i4 = 1;
            }
            if (i3 != i4) {
                return false;
            }
            int i5 = this.c;
            if (i5 == 0) {
                i5 = 1;
            }
            int i6 = appTheme.c;
            if (i6 == 0) {
                i6 = 1;
            }
            if (i5 != i6) {
                return false;
            }
            int i7 = this.d;
            if (i7 == 0) {
                i7 = 3;
            }
            int i8 = appTheme.d;
            if (i7 != (i8 != 0 ? i8 : 3) || this.e != appTheme.e || !Objects.equals(this.f, appTheme.f) || !Objects.equals(this.g, appTheme.g) || !Objects.equals(this.h, appTheme.h) || !Objects.equals(this.i, appTheme.i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            i = 1;
        }
        int i2 = i * 31;
        int i3 = this.a;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = (i3 + i2) * 31;
        int i5 = this.c;
        int i6 = ((i5 != 0 ? i5 : 1) + i4) * 31;
        int i7 = this.d;
        if (i7 == 0) {
            i7 = 3;
        }
        return ((((((((((i7 + i6) * 31) + this.e) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i);
    }

    public final String toString() {
        int i = this.e;
        int i2 = this.a;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = this.b;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = this.d;
        if (i4 == 0) {
            i4 = 3;
        }
        int i5 = this.c;
        if (i5 == 0) {
            i5 = 1;
        }
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i3).length();
        int length4 = String.valueOf(i4).length();
        int length5 = String.valueOf(i5).length();
        int length6 = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 42 + length2 + 16 + length3 + 19 + length4 + 19 + length5 + 8 + length6 + 12 + valueOf2.length() + 15 + valueOf3.length() + 16 + valueOf4.length() + 1);
        me4.r(sb, "AppTheme {deviceExperience =", i, ", colorTheme =", i2);
        me4.r(sb, ", dynamicColor =", i3, ", screenItemsSize =", i4);
        fn0.s(i5, ", screenAlignment =", ", icon =", valueOf, sb);
        bf3.v(sb, ", headline =", valueOf2, ", description =", valueOf3);
        return wt3.m(", callToAction =", valueOf4, sb, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        int i2 = this.a;
        if (i2 == 0) {
            i2 = 1;
        }
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        if (i3 == 0) {
            i3 = 1;
        }
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        int i5 = i4 != 0 ? i4 : 1;
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(i5);
        int i6 = this.d;
        int i7 = i6 != 0 ? i6 : 3;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i7);
        int i8 = this.e;
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(i8);
        SafeParcelWriter.l(parcel, 6, this.f, i, false);
        SafeParcelWriter.l(parcel, 7, this.g, i, false);
        SafeParcelWriter.l(parcel, 8, this.h, i, false);
        SafeParcelWriter.l(parcel, 9, this.i, i, false);
        SafeParcelWriter.t(parcel, s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @ShowFirstParty
    public static class Icon extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<Icon> CREATOR = new zzp();
        public final int a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @ShowFirstParty
        public static class Builder {
            @ShowFirstParty
            public Builder() {
                new Icon();
            }
        }

        public Icon() {
            this.a = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.a == ((Icon) obj).a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode();
        }

        public final String toString() {
            int i = this.a;
            return fn0.k(i, "Icon { componentAlignment=", " }", new StringBuilder(String.valueOf(i).length() + 28));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a);
            SafeParcelWriter.t(parcel, s);
        }

        public Icon(int i) {
            this.a = i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @ShowFirstParty
    public static class Description extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<Description> CREATOR = new zzm();
        public final int a;
        public final int b;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @ShowFirstParty
        public static class Builder {
            @ShowFirstParty
            public Builder() {
                new Description();
            }
        }

        public Description() {
            this.a = 0;
            this.b = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Description description = (Description) obj;
                if (this.a == description.a && this.b == description.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
        }

        public final String toString() {
            int i = this.a;
            int length = String.valueOf(i).length();
            int i2 = this.b;
            StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(i2).length() + 2);
            me4.r(sb, "Description { textAlignment=", i, ", textSize=", i2);
            sb.append(" }");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a);
            SafeParcelWriter.r(parcel, 2, 4);
            parcel.writeInt(this.b);
            SafeParcelWriter.t(parcel, s);
        }

        public Description(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @ShowFirstParty
    public static class CallToAction extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<CallToAction> CREATOR = new zze();
        public final int a;
        public final int b;
        public final int c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @ShowFirstParty
        public static class Builder {
            @ShowFirstParty
            public Builder() {
                new CallToAction();
            }
        }

        public CallToAction() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                CallToAction callToAction = (CallToAction) obj;
                if (this.a == callToAction.a && this.b == callToAction.b && this.c == callToAction.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            int i = this.a;
            int length = String.valueOf(i).length();
            int i2 = this.b;
            int length2 = String.valueOf(i2).length();
            int i3 = this.c;
            StringBuilder sb = new StringBuilder(wt3.h(length, 37, length2, 15, String.valueOf(i3).length()) + 2);
            me4.r(sb, "CallToAction { textSize=", i, ", buttonSize=", i2);
            return fn0.k(i3, ", cornerRadius=", " }", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a);
            SafeParcelWriter.r(parcel, 2, 4);
            parcel.writeInt(this.b);
            SafeParcelWriter.r(parcel, 3, 4);
            parcel.writeInt(this.c);
            SafeParcelWriter.t(parcel, s);
        }

        public CallToAction(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @ShowFirstParty
    public static class Headline extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<Headline> CREATOR = new zzo();
        public final int a;
        public final int b;
        public final int c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @ShowFirstParty
        public static class Builder {
            @ShowFirstParty
            public Builder() {
                new Headline();
            }
        }

        public Headline() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Headline headline = (Headline) obj;
                if (this.a == headline.a && this.b == headline.b && this.c == headline.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            int i = this.a;
            int length = String.valueOf(i).length();
            int i2 = this.b;
            int length2 = String.valueOf(i2).length();
            int i3 = this.c;
            StringBuilder sb = new StringBuilder(wt3.h(length, 38, length2, 11, String.valueOf(i3).length()) + 2);
            me4.r(sb, "Headline { textAlignment=", i, ", textWeight=", i2);
            return fn0.k(i3, ", textSize=", " }", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a);
            SafeParcelWriter.r(parcel, 2, 4);
            parcel.writeInt(this.b);
            SafeParcelWriter.r(parcel, 3, 4);
            parcel.writeInt(this.c);
            SafeParcelWriter.t(parcel, s);
        }

        public Headline(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }
}
