package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.badge.BadgeState$State;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dz0 {
    public final BadgeState$State a;
    public final BadgeState$State b = new BadgeState$State();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public dz0(Context context) {
        AttributeSet attributeSet;
        int i;
        int next;
        BadgeState$State badgeState$State = new BadgeState$State();
        int i2 = badgeState$State.a;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
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
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = asAttributeSet;
                i = asAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(bf3.i(i2, new StringBuilder("Can't load badge resource ID #0x")));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray Y = m6k.Y(context, attributeSet, pjf.c, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.c = Y.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = Y.getDimensionPixelSize(15, -1);
        this.e = Y.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = Y.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = Y.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = Y.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = Y.getInt(25, 1);
        this.l = Y.getInt(2, 0);
        BadgeState$State badgeState$State2 = this.b;
        int i3 = badgeState$State.i;
        badgeState$State2.i = i3 == -2 ? 255 : i3;
        int i4 = badgeState$State.k;
        if (i4 != -2) {
            badgeState$State2.k = i4;
        } else {
            boolean hasValue = Y.hasValue(24);
            BadgeState$State badgeState$State3 = this.b;
            if (hasValue) {
                badgeState$State3.k = Y.getInt(24, 0);
            } else {
                badgeState$State3.k = -1;
            }
        }
        String str = badgeState$State.j;
        if (str != null) {
            this.b.j = str;
        } else if (Y.hasValue(8)) {
            this.b.j = Y.getString(8);
        }
        BadgeState$State badgeState$State4 = this.b;
        badgeState$State4.o = badgeState$State.o;
        CharSequence charSequence = badgeState$State.p;
        badgeState$State4.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State5 = this.b;
        int i5 = badgeState$State.q;
        badgeState$State5.q = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = badgeState$State.r;
        badgeState$State5.r = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = badgeState$State.t;
        badgeState$State5.t = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State6 = this.b;
        int i7 = badgeState$State.l;
        badgeState$State6.l = i7 == -2 ? Y.getInt(22, -2) : i7;
        BadgeState$State badgeState$State7 = this.b;
        int i8 = badgeState$State.m;
        badgeState$State7.m = i8 == -2 ? Y.getInt(23, -2) : i8;
        BadgeState$State badgeState$State8 = this.b;
        Integer num = badgeState$State.e;
        badgeState$State8.e = Integer.valueOf(num == null ? Y.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State9 = this.b;
        Integer num2 = badgeState$State.f;
        badgeState$State9.f = Integer.valueOf(num2 == null ? Y.getResourceId(7, 0) : num2.intValue());
        BadgeState$State badgeState$State10 = this.b;
        Integer num3 = badgeState$State.g;
        badgeState$State10.g = Integer.valueOf(num3 == null ? Y.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State11 = this.b;
        Integer num4 = badgeState$State.h;
        badgeState$State11.h = Integer.valueOf(num4 == null ? Y.getResourceId(17, 0) : num4.intValue());
        BadgeState$State badgeState$State12 = this.b;
        Integer num5 = badgeState$State.b;
        badgeState$State12.b = Integer.valueOf(num5 == null ? w3a.x(context, Y, 1).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State13 = this.b;
        Integer num6 = badgeState$State.d;
        badgeState$State13.d = Integer.valueOf(num6 == null ? Y.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.c;
        if (num7 != null) {
            this.b.c = num7;
        } else {
            boolean hasValue2 = Y.hasValue(10);
            BadgeState$State badgeState$State14 = this.b;
            if (hasValue2) {
                badgeState$State14.c = Integer.valueOf(w3a.x(context, Y, 10).getDefaultColor());
            } else {
                int intValue = badgeState$State14.d.intValue();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, dkf.y);
                obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ColorStateList x = w3a.x(context, obtainStyledAttributes, 3);
                w3a.x(context, obtainStyledAttributes, 4);
                w3a.x(context, obtainStyledAttributes, 5);
                obtainStyledAttributes.getInt(2, 0);
                obtainStyledAttributes.getInt(1, 1);
                int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
                obtainStyledAttributes.getResourceId(i9, 0);
                obtainStyledAttributes.getString(i9);
                obtainStyledAttributes.getBoolean(14, false);
                w3a.x(context, obtainStyledAttributes, 6);
                obtainStyledAttributes.getFloat(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                obtainStyledAttributes.getFloat(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                obtainStyledAttributes.getFloat(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, pjf.G);
                obtainStyledAttributes2.hasValue(0);
                obtainStyledAttributes2.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
                obtainStyledAttributes2.recycle();
                this.b.c = Integer.valueOf(x.getDefaultColor());
            }
        }
        BadgeState$State badgeState$State15 = this.b;
        Integer num8 = badgeState$State.s;
        badgeState$State15.s = Integer.valueOf(num8 == null ? Y.getInt(3, 8388661) : num8.intValue());
        BadgeState$State badgeState$State16 = this.b;
        Integer num9 = badgeState$State.u;
        badgeState$State16.u = Integer.valueOf(num9 == null ? Y.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State17 = this.b;
        Integer num10 = badgeState$State.v;
        badgeState$State17.v = Integer.valueOf(num10 == null ? Y.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State18 = this.b;
        Integer num11 = badgeState$State.w;
        badgeState$State18.w = Integer.valueOf(num11 == null ? Y.getDimensionPixelOffset(19, 0) : num11.intValue());
        BadgeState$State badgeState$State19 = this.b;
        Integer num12 = badgeState$State.x;
        badgeState$State19.x = Integer.valueOf(num12 == null ? Y.getDimensionPixelOffset(26, 0) : num12.intValue());
        BadgeState$State badgeState$State20 = this.b;
        Integer num13 = badgeState$State.y;
        badgeState$State20.y = Integer.valueOf(num13 == null ? Y.getDimensionPixelOffset(20, badgeState$State20.w.intValue()) : num13.intValue());
        BadgeState$State badgeState$State21 = this.b;
        Integer num14 = badgeState$State.z;
        badgeState$State21.z = Integer.valueOf(num14 == null ? Y.getDimensionPixelOffset(27, badgeState$State21.x.intValue()) : num14.intValue());
        BadgeState$State badgeState$State22 = this.b;
        Integer num15 = badgeState$State.C;
        badgeState$State22.C = Integer.valueOf(num15 == null ? Y.getDimensionPixelOffset(21, 0) : num15.intValue());
        BadgeState$State badgeState$State23 = this.b;
        Integer num16 = badgeState$State.A;
        badgeState$State23.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State24 = this.b;
        Integer num17 = badgeState$State.B;
        badgeState$State24.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State25 = this.b;
        Boolean bool2 = badgeState$State.D;
        badgeState$State25.D = Boolean.valueOf(bool2 == null ? Y.getBoolean(0, false) : bool2.booleanValue());
        Y.recycle();
        Locale locale = badgeState$State.n;
        BadgeState$State badgeState$State26 = this.b;
        if (locale == null) {
            badgeState$State26.n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            badgeState$State26.n = locale;
        }
        this.a = badgeState$State;
    }
}
