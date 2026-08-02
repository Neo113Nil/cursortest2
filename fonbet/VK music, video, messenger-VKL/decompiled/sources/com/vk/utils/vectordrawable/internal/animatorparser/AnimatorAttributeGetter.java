package com.vk.utils.vectordrawable.internal.animatorparser;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.internal.animatorparser.b;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.arm0;
import xsna.asp;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.x19;
import xsna.zrp;
import xsna.zym;

/* compiled from: AnimatorAttributeGetter.kt */
/* loaded from: classes6.dex */
public abstract class AnimatorAttributeGetter<T> {
    public final AnimatorAttribute a;
    public final T b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class AnimatorAttribute {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnimatorAttribute[] $VALUES;
        public static final AnimatorAttribute DURATION;
        public static final AnimatorAttribute INTERPOLATOR;
        public static final AnimatorAttribute PATH_DATA;
        public static final AnimatorAttribute PROPERTY_NAME;
        public static final AnimatorAttribute PROPERTY_X_NAME;
        public static final AnimatorAttribute PROPERTY_Y_NAME;
        public static final AnimatorAttribute REPEAT_COUNT;
        public static final AnimatorAttribute REPEAT_MODE;
        public static final AnimatorAttribute START_OFFSET;
        public static final AnimatorAttribute VALUE_FROM;
        public static final AnimatorAttribute VALUE_TO;
        public static final AnimatorAttribute VALUE_TYPE;
        private final String tag;

        static {
            AnimatorAttribute animatorAttribute = new AnimatorAttribute("INTERPOLATOR", 0, "interpolator");
            INTERPOLATOR = animatorAttribute;
            AnimatorAttribute animatorAttribute2 = new AnimatorAttribute("DURATION", 1, "duration");
            DURATION = animatorAttribute2;
            AnimatorAttribute animatorAttribute3 = new AnimatorAttribute("VALUE_FROM", 2, "valueFrom");
            VALUE_FROM = animatorAttribute3;
            AnimatorAttribute animatorAttribute4 = new AnimatorAttribute("VALUE_TO", 3, "valueTo");
            VALUE_TO = animatorAttribute4;
            AnimatorAttribute animatorAttribute5 = new AnimatorAttribute("VALUE_TYPE", 4, "valueType");
            VALUE_TYPE = animatorAttribute5;
            AnimatorAttribute animatorAttribute6 = new AnimatorAttribute("PROPERTY_NAME", 5, "propertyName");
            PROPERTY_NAME = animatorAttribute6;
            AnimatorAttribute animatorAttribute7 = new AnimatorAttribute("PROPERTY_X_NAME", 6, "propertyXName");
            PROPERTY_X_NAME = animatorAttribute7;
            AnimatorAttribute animatorAttribute8 = new AnimatorAttribute("PROPERTY_Y_NAME", 7, "propertyYName");
            PROPERTY_Y_NAME = animatorAttribute8;
            AnimatorAttribute animatorAttribute9 = new AnimatorAttribute("PATH_DATA", 8, "pathData");
            PATH_DATA = animatorAttribute9;
            AnimatorAttribute animatorAttribute10 = new AnimatorAttribute("START_OFFSET", 9, "startOffset");
            START_OFFSET = animatorAttribute10;
            AnimatorAttribute animatorAttribute11 = new AnimatorAttribute("REPEAT_COUNT", 10, "repeatCount");
            REPEAT_COUNT = animatorAttribute11;
            AnimatorAttribute animatorAttribute12 = new AnimatorAttribute("REPEAT_MODE", 11, "repeatMode");
            REPEAT_MODE = animatorAttribute12;
            AnimatorAttribute[] animatorAttributeArr = {animatorAttribute, animatorAttribute2, animatorAttribute3, animatorAttribute4, animatorAttribute5, animatorAttribute6, animatorAttribute7, animatorAttribute8, animatorAttribute9, animatorAttribute10, animatorAttribute11, animatorAttribute12};
            $VALUES = animatorAttributeArr;
            $ENTRIES = new asp(animatorAttributeArr);
        }

        public AnimatorAttribute(String str, int i, String str2) {
            this.tag = str2;
        }

        public static AnimatorAttribute valueOf(String str) {
            return (AnimatorAttribute) Enum.valueOf(AnimatorAttribute.class, str);
        }

        public static AnimatorAttribute[] values() {
            return (AnimatorAttribute[]) $VALUES.clone();
        }

        public final String h() {
            return this.tag;
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class a extends AnimatorAttributeGetter<Long> {
        public static final a c = new a(AnimatorAttribute.DURATION, 300L);

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final Long a(Context context, XmlResourceParser xmlResourceParser, int i) {
            Long n = arm0.n(xmlResourceParser.getAttributeValue(i));
            return Long.valueOf(n != null ? n.longValue() : 0L);
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class b extends AnimatorAttributeGetter<Interpolator> {
        public static final b c = new b(AnimatorAttribute.INTERPOLATOR, new AccelerateDecelerateInterpolator());

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final Interpolator a(Context context, XmlResourceParser xmlResourceParser, int i) {
            int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
            if (attributeResourceValue != 0) {
                return AnimationUtils.loadInterpolator(context, attributeResourceValue);
            }
            throw new IllegalStateException("Can't parse interpolator");
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class c extends AnimatorAttributeGetter<String> {
        public static final c c = new c(AnimatorAttribute.PATH_DATA, "");

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final String a(Context context, XmlResourceParser xmlResourceParser, int i) {
            return xmlResourceParser.getAttributeValue(i);
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class d extends AnimatorAttributeGetter<String> {
        public static final d c = new d(AnimatorAttribute.PROPERTY_NAME, "");

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final String a(Context context, XmlResourceParser xmlResourceParser, int i) {
            return xmlResourceParser.getAttributeValue(i);
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class e extends AnimatorAttributeGetter<String> {
        public static final e c = new e(AnimatorAttribute.PROPERTY_X_NAME, "");

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final String a(Context context, XmlResourceParser xmlResourceParser, int i) {
            return xmlResourceParser.getAttributeValue(i);
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class f extends AnimatorAttributeGetter<String> {
        public static final f c = new f(AnimatorAttribute.PROPERTY_Y_NAME, "");

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final String a(Context context, XmlResourceParser xmlResourceParser, int i) {
            return xmlResourceParser.getAttributeValue(i);
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class g extends AnimatorAttributeGetter<Integer> {
        public static final g c = new g(AnimatorAttribute.REPEAT_COUNT, 0);

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final Integer a(Context context, XmlResourceParser xmlResourceParser, int i) {
            return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class h extends AnimatorAttributeGetter<Integer> {
        public static final h c = new h(AnimatorAttribute.REPEAT_MODE, 1);

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final Integer a(Context context, XmlResourceParser xmlResourceParser, int i) {
            return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class i extends AnimatorAttributeGetter<Long> {
        public static final i c = new i(AnimatorAttribute.START_OFFSET, 0L);

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final Long a(Context context, XmlResourceParser xmlResourceParser, int i) {
            return Long.valueOf(Long.parseLong(xmlResourceParser.getAttributeValue(i)));
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static abstract class j extends AnimatorAttributeGetter<com.vk.utils.vectordrawable.internal.animatorparser.b<?>> {
        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final com.vk.utils.vectordrawable.internal.animatorparser.b<?> a(Context context, XmlResourceParser xmlResourceParser, int i) {
            float parseFloat;
            com.vk.utils.vectordrawable.internal.animatorparser.b<?> b = m.c.b(context, xmlResourceParser);
            if (!(b instanceof b.a) && drm0.d0(xmlResourceParser.getAttributeValue(i), '#')) {
                b = new b.a(0);
            }
            if (b instanceof b.a) {
                return new b.a(x19.Q(xmlResourceParser.getAttributeValue(i)));
            }
            if (b instanceof b.C1942b) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                try {
                    parseFloat = zym.a(context, attributeValue);
                } catch (NumberFormatException unused) {
                    parseFloat = Float.parseFloat(attributeValue);
                }
                return new b.C1942b(parseFloat);
            }
            if (b instanceof b.c) {
                return new b.c(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
            }
            if (b instanceof b.d) {
                return new b.d(xmlResourceParser.getAttributeValue(i));
            }
            if (!epx.f(b, b.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Undefined " + this.a.h() + " type");
        }
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class k extends j {
        public static final k c = new k(AnimatorAttribute.VALUE_FROM, null);
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class l extends j {
        public static final l c = new l(AnimatorAttribute.VALUE_TO, null);
    }

    /* compiled from: AnimatorAttributeGetter.kt */
    public static final class m extends AnimatorAttributeGetter<com.vk.utils.vectordrawable.internal.animatorparser.b<?>> {
        public static final m c = new m(AnimatorAttribute.VALUE_TYPE, new b.C1942b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));

        @Override // com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter
        public final com.vk.utils.vectordrawable.internal.animatorparser.b<?> a(Context context, XmlResourceParser xmlResourceParser, int i) {
            Integer num;
            Iterator<T> it = e43.l(AnimatorAttribute.VALUE_FROM, AnimatorAttribute.VALUE_TO).iterator();
            while (true) {
                if (!it.hasNext()) {
                    num = null;
                    break;
                }
                num = (Integer) x19.u(xmlResourceParser).get(((AnimatorAttribute) it.next()).h());
                if (num != null) {
                    break;
                }
            }
            String attributeValue = num != null ? xmlResourceParser.getAttributeValue(num.intValue()) : null;
            int parseInt = (attributeValue == null || !drm0.d0(attributeValue, '#')) ? Integer.parseInt(xmlResourceParser.getAttributeValue(i)) : 3;
            if (parseInt == 0) {
                return new b.C1942b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (parseInt == 1) {
                return new b.c(0);
            }
            if (parseInt == 2) {
                return new b.d("");
            }
            if (parseInt == 3) {
                return new b.a(0);
            }
            if (parseInt == 4) {
                return b.e.a;
            }
            throw new IllegalStateException("unknown value type " + xmlResourceParser.getAttributeValue(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorAttributeGetter(AnimatorAttribute animatorAttribute, Object obj) {
        this.a = animatorAttribute;
        this.b = obj;
    }

    public abstract T a(Context context, XmlResourceParser xmlResourceParser, int i2);

    public final T b(Context context, XmlResourceParser xmlResourceParser) {
        Integer num = (Integer) x19.u(xmlResourceParser).get(this.a.h());
        return num != null ? a(context, xmlResourceParser, num.intValue()) : this.b;
    }
}
