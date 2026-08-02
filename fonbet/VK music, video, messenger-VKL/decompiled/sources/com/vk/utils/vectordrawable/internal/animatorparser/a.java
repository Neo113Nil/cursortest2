package com.vk.utils.vectordrawable.internal.animatorparser;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.InflateException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.internal.animatorparser.AnimatorAttributeGetter;
import com.vk.utils.vectordrawable.internal.animatorparser.b;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NotImplementedError;
import xsna.arm0;
import xsna.fy2;
import xsna.ky8;
import xsna.rq90;
import xsna.t7e0;
import xsna.x19;

/* compiled from: AnimatorParser.kt */
/* loaded from: classes6.dex */
public final class a {
    public static final fy2 c = new fy2();
    public final Context a;
    public final Resources b;

    public a(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x01f7, code lost:
    
        if (r24 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x01f9, code lost:
    
        r0 = (android.animation.Animator[]) r6.toArray(new android.animation.Animator[0]);
        r23.playTogether((android.animation.Animator[]) java.util.Arrays.copyOf(r0, r0.length));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x020d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x020e, code lost:
    
        r0 = (android.animation.Animator[]) r6.toArray(new android.animation.Animator[0]);
        r23.playSequentially((android.animation.Animator[]) java.util.Arrays.copyOf(r0, r0.length));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0222, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01f3, code lost:
    
        if (r23 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x01f5, code lost:
    
        if (r6 == null) goto L99;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator a(XmlResourceParser xmlResourceParser, AnimatorSet animatorSet, int i) {
        ObjectAnimator objectAnimator;
        Integer m;
        a aVar = this;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int eventType = xmlResourceParser2.getEventType();
        int depth = xmlResourceParser2.getDepth();
        xmlResourceParser2.next();
        ArrayList arrayList = null;
        ObjectAnimator objectAnimator2 = null;
        while (true) {
            int i2 = 0;
            if ((eventType != 3 || xmlResourceParser2.getDepth() > depth) && eventType != 1) {
                if (eventType != 2) {
                    eventType = xmlResourceParser2.next();
                } else {
                    String name = xmlResourceParser2.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case -1678405661:
                                if (name.equals("propertyValuesHolder")) {
                                    throw new NotImplementedError("An operation is not implemented: Not implemented yet");
                                }
                                break;
                            case -1493597370:
                                if (name.equals("objectAnimator")) {
                                    XmlResourceParser ky8Var = new ky8(xmlResourceParser2);
                                    objectAnimator2 = new ObjectAnimator();
                                    aVar.b(objectAnimator2, ky8Var);
                                    AnimatorAttributeGetter.c cVar = AnimatorAttributeGetter.c.c;
                                    Context context = aVar.a;
                                    String b = cVar.b(context, ky8Var);
                                    if (b.length() <= 0) {
                                        objectAnimator2.setPropertyName(AnimatorAttributeGetter.d.c.b(context, ky8Var));
                                        break;
                                    } else {
                                        String b2 = AnimatorAttributeGetter.e.c.b(context, ky8Var);
                                        String b3 = AnimatorAttributeGetter.f.c.b(context, ky8Var);
                                        b<?> b4 = AnimatorAttributeGetter.m.c.b(context, ky8Var);
                                        if ((b4 instanceof b.d) || (b4 instanceof b.e)) {
                                            new b.C1942b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        }
                                        if (b2.length() != 0 || b2.length() != 0) {
                                            Path d = rq90.d(b);
                                            PathMeasure pathMeasure = new PathMeasure(d, false);
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                                            float f = 0.0f;
                                            do {
                                                f = pathMeasure.getLength() + f;
                                                arrayList2.add(Float.valueOf(f));
                                            } while (pathMeasure.nextContour());
                                            PathMeasure pathMeasure2 = new PathMeasure(d, false);
                                            int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                                            float[] fArr = new float[min];
                                            float[] fArr2 = new float[min];
                                            float[] fArr3 = new float[2];
                                            float f2 = f / (min - 1);
                                            int i3 = 0;
                                            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            for (int i4 = 0; i4 < min; i4++) {
                                                int i5 = i3;
                                                pathMeasure2.getPosTan(f3 - ((Number) arrayList2.get(i3)).floatValue(), fArr3, null);
                                                fArr[i4] = fArr3[0];
                                                fArr2[i4] = fArr3[1];
                                                f3 += f2;
                                                i3 = i5 + 1;
                                                if (i3 >= arrayList2.size() || f3 <= ((Number) arrayList2.get(i3)).floatValue()) {
                                                    i3 = i5;
                                                } else {
                                                    pathMeasure2.nextContour();
                                                }
                                            }
                                            if (b2.length() <= 0) {
                                                b2 = null;
                                            }
                                            PropertyValuesHolder ofFloat = b2 != null ? PropertyValuesHolder.ofFloat(b2, Arrays.copyOf(fArr, min)) : null;
                                            if (b3.length() <= 0) {
                                                b3 = null;
                                            }
                                            PropertyValuesHolder ofFloat2 = b3 != null ? PropertyValuesHolder.ofFloat(b3, Arrays.copyOf(fArr2, min)) : null;
                                            if (ofFloat == null) {
                                                objectAnimator2.setValues(ofFloat2);
                                                break;
                                            } else if (ofFloat2 == null) {
                                                objectAnimator2.setValues(ofFloat);
                                                break;
                                            } else {
                                                objectAnimator2.setValues(ofFloat, ofFloat2);
                                                break;
                                            }
                                        } else {
                                            throw new InflateException("propertyXName or propertyYName is need for PathData");
                                        }
                                    }
                                }
                                break;
                            case -795202841:
                                if (name.equals("animator")) {
                                    ValueAnimator valueAnimator = new ValueAnimator();
                                    aVar.b(valueAnimator, xmlResourceParser2);
                                    objectAnimator = valueAnimator;
                                    objectAnimator2 = objectAnimator;
                                    break;
                                }
                                break;
                            case 113762:
                                if (name.equals("set")) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    Integer num = (Integer) x19.u(xmlResourceParser2).get("ordering");
                                    if (num != null && (m = arm0.m(10, xmlResourceParser2.getAttributeValue(num.intValue()))) != null) {
                                        i2 = m.intValue();
                                    }
                                    aVar.a(xmlResourceParser2, animatorSet2, i2);
                                    objectAnimator = animatorSet2;
                                    objectAnimator2 = objectAnimator;
                                    break;
                                }
                                break;
                        }
                    }
                    if (animatorSet != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (objectAnimator2 != null) {
                            arrayList.add(objectAnimator2);
                        }
                    }
                    eventType = xmlResourceParser.next();
                    aVar = this;
                    xmlResourceParser2 = xmlResourceParser;
                }
            }
        }
    }

    public final void b(ValueAnimator valueAnimator, XmlResourceParser xmlResourceParser) {
        AnimatorAttributeGetter.b bVar = AnimatorAttributeGetter.b.c;
        Context context = this.a;
        valueAnimator.setInterpolator(bVar.b(context, xmlResourceParser));
        valueAnimator.setDuration(AnimatorAttributeGetter.a.c.b(context, xmlResourceParser).longValue());
        valueAnimator.setStartDelay(AnimatorAttributeGetter.i.c.b(context, xmlResourceParser).longValue());
        valueAnimator.setRepeatCount(AnimatorAttributeGetter.g.c.b(context, xmlResourceParser).intValue());
        valueAnimator.setRepeatMode(AnimatorAttributeGetter.h.c.b(context, xmlResourceParser).intValue());
        String b = AnimatorAttributeGetter.d.c.b(context, xmlResourceParser);
        b<?> b2 = AnimatorAttributeGetter.k.c.b(context, xmlResourceParser);
        b<?> b3 = AnimatorAttributeGetter.l.c.b(context, xmlResourceParser);
        b<?> b4 = AnimatorAttributeGetter.m.c.b(context, xmlResourceParser);
        if ((b2 instanceof b.a) || (b3 instanceof b.a)) {
            b4 = new b.a(0);
        } else if (b4 instanceof b.e) {
            b4 = new b.C1942b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        boolean z = b4 instanceof b.C1942b;
        PropertyValuesHolder propertyValuesHolder = null;
        propertyValuesHolder = null;
        propertyValuesHolder = null;
        if (b4 instanceof b.d) {
            boolean z2 = b2 instanceof b.d;
            b.d dVar = z2 ? (b.d) b2 : null;
            rq90.a[] c2 = dVar != null ? rq90.c(dVar.a) : null;
            boolean z3 = b3 instanceof b.d;
            b.d dVar2 = z3 ? (b.d) b3 : null;
            rq90.a[] c3 = dVar2 != null ? rq90.c(dVar2.a) : null;
            if (c2 != null || c3 != null) {
                if (c2 != null) {
                    t7e0 t7e0Var = new t7e0();
                    if (c3 == null) {
                        propertyValuesHolder = PropertyValuesHolder.ofObject(b, t7e0Var, c2);
                    } else {
                        if (!rq90.a(c2, c3)) {
                            StringBuilder sb = new StringBuilder("Can't morph from ");
                            b.d dVar3 = z2 ? (b.d) b2 : null;
                            sb.append(dVar3 != null ? dVar3.a : null);
                            sb.append(" to ");
                            b.d dVar4 = z3 ? (b.d) b3 : null;
                            sb.append(dVar4 != null ? dVar4.a : null);
                            throw new InflateException(sb.toString());
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofObject(b, t7e0Var, c2, c3);
                    }
                } else if (c3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(b, new t7e0(), c3);
                }
            }
        } else {
            ArgbEvaluator argbEvaluator = b4 instanceof b.a ? new ArgbEvaluator() : null;
            if (z) {
                if (b2 != null) {
                    float f = ((b.C1942b) b2).a;
                    propertyValuesHolder = b3 != null ? PropertyValuesHolder.ofFloat(b, f, ((b.C1942b) b3).a) : PropertyValuesHolder.ofFloat(b, f);
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((b.C1942b) b3).a);
                }
            } else if (b2 != null) {
                int i = b2 instanceof b.a ? ((b.a) b2).a : ((b.c) b2).a;
                if (b3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(b, i, b3 instanceof b.a ? ((b.a) b3).a : ((b.c) b3).a);
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(b, i);
                }
            } else if (b3 != null) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(b, b3 instanceof b.a ? ((b.a) b3).a : ((b.c) b3).a);
            }
            if (propertyValuesHolder != null && argbEvaluator != null) {
                propertyValuesHolder.setEvaluator(argbEvaluator);
            }
        }
        if (propertyValuesHolder != null) {
            valueAnimator.setValues(propertyValuesHolder);
        }
    }
}
