package com.nineoldandroids.animation;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public class AnimatorInflater {
    private static final int AnimatorSet_ordering = 0;
    private static final int Animator_duration = 1;
    private static final int Animator_interpolator = 0;
    private static final int Animator_repeatCount = 3;
    private static final int Animator_repeatMode = 4;
    private static final int Animator_startOffset = 2;
    private static final int Animator_valueFrom = 5;
    private static final int Animator_valueTo = 6;
    private static final int Animator_valueType = 7;
    private static final int PropertyAnimator_propertyName = 0;
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int[] AnimatorSet = {R.attr.ordering};
    private static final int[] PropertyAnimator = {R.attr.propertyName};
    private static final int[] Animator = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    public static Animator loadAnimator(Context context, int i) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = context.getResources().getAnimation(i);
                return createAnimatorFromXml(context, xmlResourceParser);
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static Animator createAnimatorFromXml(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return createAnimatorFromXml(context, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0);
    }

    private static Animator createAnimatorFromXml(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        int i2;
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = null;
        Animator animator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        animator = loadObjectAnimator(context, attributeSet);
                    } else if (name.equals("animator")) {
                        animator = loadAnimator(context, attributeSet, null);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnimatorSet);
                        TypedValue typedValue = new TypedValue();
                        obtainStyledAttributes.getValue(0, typedValue);
                        createAnimatorFromXml(context, xmlPullParser, attributeSet, animatorSet2, typedValue.type == 16 ? typedValue.data : 0);
                        obtainStyledAttributes.recycle();
                        animator = animatorSet2;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i2] = (Animator) it.next();
                i2++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
                return animator;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator;
    }

    private static ObjectAnimator loadObjectAnimator(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        loadAnimator(context, attributeSet, objectAnimator);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PropertyAnimator);
        objectAnimator.setPropertyName(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        return objectAnimator;
    }

    private static ValueAnimator loadAnimator(Context context, AttributeSet attributeSet, ValueAnimator valueAnimator) throws Resources.NotFoundException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        float f2;
        float f3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Animator);
        long j = obtainStyledAttributes.getInt(1, 0);
        long j2 = obtainStyledAttributes.getInt(2, 0);
        int i8 = obtainStyledAttributes.getInt(7, 0);
        ValueAnimator valueAnimator2 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        int i9 = i8 == 0 ? 1 : 0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(5);
        boolean z = peekValue != null;
        int i10 = z ? peekValue.type : 0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
        boolean z2 = peekValue2 != null;
        if (z2) {
            i2 = peekValue2.type;
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if ((z && i10 >= 28 && i10 <= 31) || (z2 && i2 >= 28 && i2 <= 31)) {
            valueAnimator2.setEvaluator(new ArgbEvaluator());
            i9 = i;
        }
        if (i9 != 0) {
            if (z) {
                if (i10 == 5) {
                    f2 = obtainStyledAttributes.getDimension(5, 0.0f);
                } else {
                    f2 = obtainStyledAttributes.getFloat(5, 0.0f);
                }
                if (z2) {
                    if (i2 == 5) {
                        f3 = obtainStyledAttributes.getDimension(6, 0.0f);
                    } else {
                        f3 = obtainStyledAttributes.getFloat(6, 0.0f);
                    }
                    float[] fArr = new float[2];
                    fArr[i] = f2;
                    fArr[1] = f3;
                    valueAnimator2.setFloatValues(fArr);
                } else {
                    float[] fArr2 = new float[1];
                    fArr2[i] = f2;
                    valueAnimator2.setFloatValues(fArr2);
                }
            } else {
                if (i2 == 5) {
                    f = obtainStyledAttributes.getDimension(6, 0.0f);
                } else {
                    f = obtainStyledAttributes.getFloat(6, 0.0f);
                }
                float[] fArr3 = new float[1];
                fArr3[i] = f;
                valueAnimator2.setFloatValues(fArr3);
            }
            i3 = i;
        } else {
            if (z) {
                if (i10 == 5) {
                    i6 = (int) obtainStyledAttributes.getDimension(5, 0.0f);
                    i5 = i;
                } else if (i10 >= 28 && i10 <= 31) {
                    i5 = i;
                    i6 = obtainStyledAttributes.getColor(5, i5);
                } else {
                    i5 = i;
                    i6 = obtainStyledAttributes.getInt(5, i5);
                }
                if (z2) {
                    if (i2 == 5) {
                        i7 = (int) obtainStyledAttributes.getDimension(6, 0.0f);
                    } else if (i2 >= 28 && i2 <= 31) {
                        i7 = obtainStyledAttributes.getColor(6, i5);
                    } else {
                        i7 = obtainStyledAttributes.getInt(6, i5);
                    }
                    valueAnimator2.setIntValues(i6, i7);
                } else {
                    valueAnimator2.setIntValues(i6);
                }
            } else if (z2) {
                if (i2 == 5) {
                    i4 = (int) obtainStyledAttributes.getDimension(6, 0.0f);
                    i3 = 0;
                } else if (i2 >= 28 && i2 <= 31) {
                    i3 = 0;
                    i4 = obtainStyledAttributes.getColor(6, 0);
                } else {
                    i3 = 0;
                    i4 = obtainStyledAttributes.getInt(6, 0);
                }
                valueAnimator2.setIntValues(i4);
            }
            i3 = 0;
        }
        valueAnimator2.setDuration(j);
        valueAnimator2.setStartDelay(j2);
        if (obtainStyledAttributes.hasValue(3)) {
            valueAnimator2.setRepeatCount(obtainStyledAttributes.getInt(3, i3));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            valueAnimator2.setRepeatMode(obtainStyledAttributes.getInt(4, 1));
        }
        int resourceId = obtainStyledAttributes.getResourceId(i3, i3);
        if (resourceId > 0) {
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
        return valueAnimator2;
    }
}
