package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$dimen;
import com.google.android.material.R$plurals;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import xsna.et;
import xsna.fpo0;
import xsna.qm10;

/* loaded from: classes13.dex */
public final class BadgeState {
    public final State a;
    public final State b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public Integer A;
        public Integer B;
        public Integer C;
        public Integer D;
        public Boolean E;
        public int b;
        public Integer c;
        public Integer d;
        public Integer e;
        public Integer f;
        public Integer g;
        public Integer h;
        public Integer i;

        @Nullable
        public String k;
        public Locale o;

        @Nullable
        public CharSequence p;

        @Nullable
        public CharSequence q;
        public int r;
        public int s;
        public Integer t;
        public Integer v;
        public Integer w;
        public Integer x;
        public Integer y;
        public Integer z;
        public int j = 255;
        public int l = -2;
        public int m = -2;
        public int n = -2;
        public Boolean u = Boolean.TRUE;

        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final State createFromParcel(@NonNull Parcel parcel) {
                State state = new State();
                state.j = 255;
                state.l = -2;
                state.m = -2;
                state.n = -2;
                state.u = Boolean.TRUE;
                state.b = parcel.readInt();
                state.c = (Integer) parcel.readSerializable();
                state.d = (Integer) parcel.readSerializable();
                state.e = (Integer) parcel.readSerializable();
                state.f = (Integer) parcel.readSerializable();
                state.g = (Integer) parcel.readSerializable();
                state.h = (Integer) parcel.readSerializable();
                state.i = (Integer) parcel.readSerializable();
                state.j = parcel.readInt();
                state.k = parcel.readString();
                state.l = parcel.readInt();
                state.m = parcel.readInt();
                state.n = parcel.readInt();
                state.p = parcel.readString();
                state.q = parcel.readString();
                state.r = parcel.readInt();
                state.t = (Integer) parcel.readSerializable();
                state.v = (Integer) parcel.readSerializable();
                state.w = (Integer) parcel.readSerializable();
                state.x = (Integer) parcel.readSerializable();
                state.y = (Integer) parcel.readSerializable();
                state.z = (Integer) parcel.readSerializable();
                state.A = (Integer) parcel.readSerializable();
                state.D = (Integer) parcel.readSerializable();
                state.B = (Integer) parcel.readSerializable();
                state.C = (Integer) parcel.readSerializable();
                state.u = (Boolean) parcel.readSerializable();
                state.o = (Locale) parcel.readSerializable();
                state.E = (Boolean) parcel.readSerializable();
                return state;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeSerializable(this.c);
            parcel.writeSerializable(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeSerializable(this.g);
            parcel.writeSerializable(this.h);
            parcel.writeSerializable(this.i);
            parcel.writeInt(this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            CharSequence charSequence = this.p;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.q;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.r);
            parcel.writeSerializable(this.t);
            parcel.writeSerializable(this.v);
            parcel.writeSerializable(this.w);
            parcel.writeSerializable(this.x);
            parcel.writeSerializable(this.y);
            parcel.writeSerializable(this.z);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.u);
            parcel.writeSerializable(this.o);
            parcel.writeSerializable(this.E);
        }
    }

    public BadgeState(Context context, @Nullable State state) {
        AttributeSet attributeSet;
        int i;
        int next;
        int i2 = a.p;
        int i3 = a.o;
        this.b = new State();
        state = state == null ? new State() : state;
        int i4 = state.b;
        if (i4 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i4);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSet = Xml.asAttributeSet(xml);
                i = attributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(et.a(i4, new StringBuilder("Can't load badge resource ID #0x")));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray d = fpo0.d(context, attributeSet, R$styleable.Badge, i2, i == 0 ? i3 : i, new int[0]);
        Resources resources = context.getResources();
        this.c = d.getDimensionPixelSize(R$styleable.Badge_badgeRadius, -1);
        this.i = context.getResources().getDimensionPixelSize(R$dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R$dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = d.getDimensionPixelSize(R$styleable.Badge_badgeWithTextRadius, -1);
        this.e = d.getDimension(R$styleable.Badge_badgeWidth, resources.getDimension(R$dimen.m3_badge_size));
        this.g = d.getDimension(R$styleable.Badge_badgeWithTextWidth, resources.getDimension(R$dimen.m3_badge_with_text_size));
        this.f = d.getDimension(R$styleable.Badge_badgeHeight, resources.getDimension(R$dimen.m3_badge_size));
        this.h = d.getDimension(R$styleable.Badge_badgeWithTextHeight, resources.getDimension(R$dimen.m3_badge_with_text_size));
        this.k = d.getInt(R$styleable.Badge_offsetAlignmentMode, 1);
        State state2 = this.b;
        int i5 = state.j;
        state2.j = i5 == -2 ? 255 : i5;
        int i6 = state.l;
        if (i6 != -2) {
            state2.l = i6;
        } else if (d.hasValue(R$styleable.Badge_number)) {
            this.b.l = d.getInt(R$styleable.Badge_number, 0);
        } else {
            this.b.l = -1;
        }
        String str = state.k;
        if (str != null) {
            this.b.k = str;
        } else if (d.hasValue(R$styleable.Badge_badgeText)) {
            this.b.k = d.getString(R$styleable.Badge_badgeText);
        }
        State state3 = this.b;
        state3.p = state.p;
        CharSequence charSequence = state.q;
        state3.q = charSequence == null ? context.getString(R$string.mtrl_badge_numberless_content_description) : charSequence;
        State state4 = this.b;
        int i7 = state.r;
        state4.r = i7 == 0 ? R$plurals.mtrl_badge_content_description : i7;
        int i8 = state.s;
        state4.s = i8 == 0 ? R$string.mtrl_exceed_max_badge_number_content_description : i8;
        Boolean bool = state.u;
        state4.u = Boolean.valueOf(bool == null || bool.booleanValue());
        State state5 = this.b;
        int i9 = state.m;
        state5.m = i9 == -2 ? d.getInt(R$styleable.Badge_maxCharacterCount, -2) : i9;
        State state6 = this.b;
        int i10 = state.n;
        state6.n = i10 == -2 ? d.getInt(R$styleable.Badge_maxNumber, -2) : i10;
        State state7 = this.b;
        Integer num = state.f;
        state7.f = Integer.valueOf(num == null ? d.getResourceId(R$styleable.Badge_badgeShapeAppearance, R$style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state8 = this.b;
        Integer num2 = state.g;
        state8.g = Integer.valueOf(num2 == null ? d.getResourceId(R$styleable.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        State state9 = this.b;
        Integer num3 = state.h;
        state9.h = Integer.valueOf(num3 == null ? d.getResourceId(R$styleable.Badge_badgeWithTextShapeAppearance, R$style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state10 = this.b;
        Integer num4 = state.i;
        state10.i = Integer.valueOf(num4 == null ? d.getResourceId(R$styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        State state11 = this.b;
        Integer num5 = state.c;
        state11.c = Integer.valueOf(num5 == null ? qm10.a(context, d, R$styleable.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        State state12 = this.b;
        Integer num6 = state.e;
        state12.e = Integer.valueOf(num6 == null ? d.getResourceId(R$styleable.Badge_badgeTextAppearance, R$style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state.d;
        if (num7 != null) {
            this.b.d = num7;
        } else if (d.hasValue(R$styleable.Badge_badgeTextColor)) {
            this.b.d = Integer.valueOf(qm10.a(context, d, R$styleable.Badge_badgeTextColor).getDefaultColor());
        } else {
            int intValue = this.b.e.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, R$styleable.TextAppearance);
            obtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ColorStateList a = qm10.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
            qm10.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
            qm10.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
            int i11 = R$styleable.TextAppearance_fontFamily;
            i11 = obtainStyledAttributes.hasValue(i11) ? i11 : R$styleable.TextAppearance_android_fontFamily;
            obtainStyledAttributes.getResourceId(i11, 0);
            obtainStyledAttributes.getString(i11);
            obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
            qm10.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, R$styleable.MaterialTextAppearance);
            obtainStyledAttributes2.hasValue(R$styleable.MaterialTextAppearance_android_letterSpacing);
            obtainStyledAttributes2.getFloat(R$styleable.MaterialTextAppearance_android_letterSpacing, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes2.recycle();
            this.b.d = Integer.valueOf(a.getDefaultColor());
        }
        State state13 = this.b;
        Integer num8 = state.t;
        state13.t = Integer.valueOf(num8 == null ? d.getInt(R$styleable.Badge_badgeGravity, 8388661) : num8.intValue());
        State state14 = this.b;
        Integer num9 = state.v;
        state14.v = Integer.valueOf(num9 == null ? d.getDimensionPixelSize(R$styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R$dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        State state15 = this.b;
        Integer num10 = state.w;
        state15.w = Integer.valueOf(num10 == null ? d.getDimensionPixelSize(R$styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R$dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        State state16 = this.b;
        Integer num11 = state.x;
        state16.x = Integer.valueOf(num11 == null ? d.getDimensionPixelOffset(R$styleable.Badge_horizontalOffset, 0) : num11.intValue());
        State state17 = this.b;
        Integer num12 = state.y;
        state17.y = Integer.valueOf(num12 == null ? d.getDimensionPixelOffset(R$styleable.Badge_verticalOffset, 0) : num12.intValue());
        State state18 = this.b;
        Integer num13 = state.z;
        state18.z = Integer.valueOf(num13 == null ? d.getDimensionPixelOffset(R$styleable.Badge_horizontalOffsetWithText, state18.x.intValue()) : num13.intValue());
        State state19 = this.b;
        Integer num14 = state.A;
        state19.A = Integer.valueOf(num14 == null ? d.getDimensionPixelOffset(R$styleable.Badge_verticalOffsetWithText, state19.y.intValue()) : num14.intValue());
        State state20 = this.b;
        Integer num15 = state.D;
        state20.D = Integer.valueOf(num15 == null ? d.getDimensionPixelOffset(R$styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        State state21 = this.b;
        Integer num16 = state.B;
        state21.B = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        State state22 = this.b;
        Integer num17 = state.C;
        state22.C = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        State state23 = this.b;
        Boolean bool2 = state.E;
        state23.E = Boolean.valueOf(bool2 == null ? d.getBoolean(R$styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        d.recycle();
        Locale locale = state.o;
        if (locale == null) {
            this.b.o = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.o = locale;
        }
        this.a = state;
    }
}
