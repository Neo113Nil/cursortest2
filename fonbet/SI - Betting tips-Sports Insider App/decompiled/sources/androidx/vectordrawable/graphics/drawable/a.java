package androidx.vectordrawable.graphics.drawable;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.c1;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2777a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2778b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2779c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2780d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2781e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2782f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2783g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f2784h = {R.attr.ordering};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2785i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2786k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03af, code lost:
    
        r2 = new android.animation.Animator[r22.size()];
        r3 = r22.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03be, code lost:
    
        if (r3.hasNext() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x03c0, code lost:
    
        r2[r11] = (android.animation.Animator) r3.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03cc, code lost:
    
        if (r33 != 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03ce, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x03d1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03d2, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03d5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03ab, code lost:
    
        if (r32 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03ad, code lost:
    
        if (r22 == null) goto L215;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x037d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i5) {
        int i10;
        ArrayList arrayList;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i16;
        ArrayList arrayList3;
        Keyframe ofFloat;
        Resources.Theme theme2;
        int i17;
        AttributeSet attributeSet3;
        Resources resources2;
        XmlPullParser xmlPullParser2;
        ValueAnimator valueAnimator;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator2 = null;
        ArrayList arrayList4 = null;
        while (true) {
            int next = xmlPullParser.next();
            int i18 = 3;
            int i19 = 0;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i20 = 1;
            if (next == 1) {
                break;
            }
            int i21 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = d(context, resources, theme, attributeSet, null, xmlPullParser);
                } else {
                    Resources resources3 = resources;
                    Resources.Theme theme3 = theme;
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray f6 = f0.b.f(resources3, theme3, attributeSet, f2784h);
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null) {
                            theme2 = theme3;
                            i17 = f6.getInt(0, 0);
                            attributeSet3 = attributeSet;
                            xmlPullParser2 = xmlPullParser;
                            resources2 = resources3;
                        } else {
                            theme2 = theme3;
                            i17 = 0;
                            attributeSet3 = attributeSet;
                            resources2 = resources3;
                            xmlPullParser2 = xmlPullParser;
                        }
                        a(context, resources2, theme2, xmlPullParser2, attributeSet3, animatorSet2, i17);
                        valueAnimator2 = animatorSet2;
                        f6.recycle();
                        i10 = depth;
                        arrayList = arrayList4;
                        if (animatorSet == null && i19 == 0) {
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(valueAnimator2);
                        } else {
                            arrayList4 = arrayList;
                        }
                        depth = i10;
                    } else {
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        ArrayList arrayList5 = null;
                        while (true) {
                            int eventType = xmlPullParser.getEventType();
                            if (eventType == i18 || eventType == i20) {
                                break;
                            }
                            if (eventType != i21) {
                                xmlPullParser.next();
                            } else {
                                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                                    TypedArray f10 = f0.b.f(resources3, theme3, asAttributeSet, f2785i);
                                    String b10 = f0.b.b(f10, xmlPullParser, "propertyName", i18);
                                    int i22 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? f10.getInt(i21, 4) : 4;
                                    attributeSet2 = asAttributeSet;
                                    int i23 = i22;
                                    i12 = i21;
                                    ArrayList arrayList6 = null;
                                    while (true) {
                                        int next2 = xmlPullParser.next();
                                        i13 = depth;
                                        if (next2 == 3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlPullParser.getName().equals("keyframe")) {
                                            int[] iArr = j;
                                            arrayList3 = arrayList4;
                                            if (i23 == 4) {
                                                TypedArray f11 = f0.b.f(resources3, theme3, Xml.asAttributeSet(xmlPullParser), iArr);
                                                TypedValue peekValue = !f0.b.c(xmlPullParser, "value") ? null : f11.peekValue(0);
                                                int i24 = (peekValue == null || !c(peekValue.type)) ? 0 : 3;
                                                f11.recycle();
                                                i23 = i24;
                                            }
                                            TypedArray f12 = f0.b.f(resources3, theme3, Xml.asAttributeSet(xmlPullParser), iArr);
                                            float f13 = f0.b.c(xmlPullParser, "fraction") ? f12.getFloat(3, -1.0f) : -1.0f;
                                            TypedValue peekValue2 = !f0.b.c(xmlPullParser, "value") ? null : f12.peekValue(0);
                                            boolean z5 = peekValue2 != null;
                                            int i25 = i23 == 4 ? (z5 && c(peekValue2.type)) ? 3 : 0 : i23;
                                            if (!z5) {
                                                ofFloat = i25 == 0 ? Keyframe.ofFloat(f13) : Keyframe.ofInt(f13);
                                            } else if (i25 == 0) {
                                                ofFloat = Keyframe.ofFloat(f13, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f12.getFloat(0, 0.0f) : 0.0f);
                                            } else if (i25 == 1 || i25 == 3) {
                                                ofFloat = Keyframe.ofInt(f13, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f12.getInt(0, 0) : 0);
                                            } else {
                                                ofFloat = null;
                                            }
                                            int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? f12.getResourceId(1, 0) : 0;
                                            if (resourceId > 0) {
                                                ofFloat.setInterpolator(e(context, resourceId));
                                            }
                                            f12.recycle();
                                            if (ofFloat != null) {
                                                if (arrayList6 == null) {
                                                    arrayList6 = new ArrayList();
                                                }
                                                arrayList6.add(ofFloat);
                                            }
                                            xmlPullParser.next();
                                        } else {
                                            arrayList3 = arrayList4;
                                        }
                                        resources3 = resources;
                                        theme3 = theme;
                                        depth = i13;
                                        arrayList4 = arrayList3;
                                    }
                                    arrayList2 = arrayList4;
                                    if (arrayList6 == null || (size = arrayList6.size()) <= 0) {
                                        i15 = 3;
                                        propertyValuesHolder = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList6.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList6.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        int i26 = size;
                                        Class cls = Integer.TYPE;
                                        Class cls2 = Float.TYPE;
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList6.add(arrayList6.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                i26++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                arrayList6.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                i26++;
                                            }
                                        }
                                        int i27 = i26;
                                        Keyframe[] keyframeArr = new Keyframe[i27];
                                        arrayList6.toArray(keyframeArr);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            Keyframe keyframe3 = keyframeArr[i28];
                                            if (keyframe3.getFraction() < 0.0f) {
                                                if (i28 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    int i29 = i27 - 1;
                                                    if (i28 == i29) {
                                                        keyframe3.setFraction(1.0f);
                                                        i16 = i27;
                                                    } else {
                                                        int i30 = i28;
                                                        for (int i31 = i28 + 1; i31 < i29 && keyframeArr[i31].getFraction() < 0.0f; i31++) {
                                                            i30 = i31;
                                                        }
                                                        float fraction3 = (keyframeArr[i30 + 1].getFraction() - keyframeArr[i28 - 1].getFraction()) / ((i30 - i28) + 2);
                                                        int i32 = i28;
                                                        while (i32 <= i30) {
                                                            float f14 = fraction3;
                                                            keyframeArr[i32].setFraction(keyframeArr[i32 - 1].getFraction() + f14);
                                                            i32++;
                                                            i27 = i27;
                                                            fraction3 = f14;
                                                        }
                                                        i16 = i27;
                                                    }
                                                    i28++;
                                                    i27 = i16;
                                                }
                                            }
                                            i16 = i27;
                                            i28++;
                                            i27 = i16;
                                        }
                                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(b10, keyframeArr);
                                        i15 = 3;
                                        if (i23 == 3) {
                                            propertyValuesHolder.setEvaluator(j.f2802a);
                                        }
                                    }
                                    i14 = 0;
                                    i11 = 1;
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = b(f10, i22, 0, 1, b10);
                                    }
                                    if (propertyValuesHolder != null) {
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        arrayList5.add(propertyValuesHolder);
                                    }
                                    f10.recycle();
                                } else {
                                    attributeSet2 = asAttributeSet;
                                    i11 = i20;
                                    i12 = i21;
                                    i13 = depth;
                                    arrayList2 = arrayList4;
                                    i14 = i19;
                                    i15 = i18;
                                }
                                xmlPullParser.next();
                                resources3 = resources;
                                i19 = i14;
                                i20 = i11;
                                i18 = i15;
                                i21 = i12;
                                asAttributeSet = attributeSet2;
                                depth = i13;
                                arrayList4 = arrayList2;
                                theme3 = theme;
                            }
                        }
                        int i33 = i20;
                        i10 = depth;
                        arrayList = arrayList4;
                        int i34 = i19;
                        if (arrayList5 != null) {
                            int size2 = arrayList5.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i35 = i34; i35 < size2; i35++) {
                                propertyValuesHolderArr[i35] = (PropertyValuesHolder) arrayList5.get(i35);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator2 instanceof ValueAnimator)) {
                            valueAnimator2.setValues(propertyValuesHolderArr);
                        }
                        i19 = i33;
                        if (animatorSet == null) {
                        }
                        arrayList4 = arrayList;
                        depth = i10;
                    }
                }
                valueAnimator2 = valueAnimator;
                i10 = depth;
                arrayList = arrayList4;
                if (animatorSet == null) {
                }
                arrayList4 = arrayList;
                depth = i10;
            }
        }
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i5, int i10, int i11, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z5 = peekValue != null;
        int i12 = z5 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i11);
        boolean z7 = peekValue2 != null;
        int i13 = z7 ? peekValue2.type : 0;
        if (i5 == 4) {
            i5 = ((z5 && c(i12)) || (z7 && c(i13))) ? 3 : 0;
        }
        boolean z10 = i5 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i5 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            g0.f[] p10 = y4.a.p(string);
            g0.f[] p11 = y4.a.p(string2);
            if (p10 != null || p11 != null) {
                if (p10 != null) {
                    i iVar = new i();
                    if (p11 == null) {
                        return PropertyValuesHolder.ofObject(str, iVar, p10);
                    }
                    if (y4.a.g(p10, p11)) {
                        return PropertyValuesHolder.ofObject(str, iVar, p10, p11);
                    }
                    throw new InflateException(c1.o(" Can't morph from ", string, " to ", string2));
                }
                if (p11 != null) {
                    return PropertyValuesHolder.ofObject(str, new i(), p11);
                }
            }
            return null;
        }
        j jVar = i5 == 3 ? j.f2802a : null;
        if (z10) {
            if (z5) {
                float dimension = i12 == 5 ? typedArray.getDimension(i10, 0.0f) : typedArray.getFloat(i10, 0.0f);
                if (z7) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z5) {
            int dimension2 = i12 == 5 ? (int) typedArray.getDimension(i10, 0.0f) : c(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0);
            if (z7) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z7) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
        }
        if (propertyValuesHolder != null && jVar != null) {
            propertyValuesHolder.setEvaluator(jVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i5) {
        return i5 >= 28 && i5 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i5;
        ValueAnimator valueAnimator2;
        TypedArray f6 = f0.b.f(resources, theme, attributeSet, f2783g);
        TypedArray f10 = f0.b.f(resources, theme, attributeSet, f2786k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        boolean c2 = f0.b.c(xmlPullParser, "duration");
        int i10 = MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION;
        if (c2) {
            i10 = f6.getInt(1, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
        }
        long j6 = i10;
        long j10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? f6.getInt(2, 0) : 0;
        int i11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? f6.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i11 == 4) {
                TypedValue peekValue = f6.peekValue(5);
                boolean z5 = peekValue != null;
                int i12 = z5 ? peekValue.type : 0;
                TypedValue peekValue2 = f6.peekValue(6);
                boolean z7 = peekValue2 != null;
                i11 = ((z5 && c(i12)) || (z7 && c(z7 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder b10 = b(f6, i11, 5, 6, "");
            if (b10 != null) {
                valueAnimator3.setValues(b10);
            }
        }
        valueAnimator3.setDuration(j6);
        valueAnimator3.setStartDelay(j10);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? f6.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? f6.getInt(4, 1) : 1);
        if (f10 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String b11 = f0.b.b(f10, xmlPullParser, "pathData", 1);
            if (b11 != null) {
                String b12 = f0.b.b(f10, xmlPullParser, "propertyXName", 2);
                String b13 = f0.b.b(f10, xmlPullParser, "propertyYName", 3);
                if (i11 != 2) {
                }
                if (b12 == null && b13 == null) {
                    throw new InflateException(f10.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path q = y4.a.q(b11);
                PathMeasure pathMeasure = new PathMeasure(q, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f11 = 0.0f;
                do {
                    f11 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f11));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(q, false);
                int min = Math.min(100, ((int) (f11 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f12 = f11 / (min - 1);
                int i13 = 0;
                valueAnimator = valueAnimator3;
                float f13 = 0.0f;
                int i14 = 0;
                while (true) {
                    if (i13 >= min) {
                        break;
                    }
                    int i15 = min;
                    pathMeasure2.getPosTan(f13 - ((Float) arrayList.get(i14)).floatValue(), fArr3, null);
                    fArr[i13] = fArr3[0];
                    fArr2[i13] = fArr3[1];
                    int i16 = i14 + 1;
                    f13 += f12;
                    if (i16 < arrayList.size() && f13 > ((Float) arrayList.get(i16)).floatValue()) {
                        pathMeasure2.nextContour();
                        i14 = i16;
                    }
                    i13++;
                    min = i15;
                }
                PropertyValuesHolder ofFloat = b12 != null ? PropertyValuesHolder.ofFloat(b12, fArr) : null;
                PropertyValuesHolder ofFloat2 = b13 != null ? PropertyValuesHolder.ofFloat(b13, fArr2) : null;
                if (ofFloat == null) {
                    objectAnimator2.setValues(ofFloat2);
                } else if (ofFloat2 == null) {
                    objectAnimator2.setValues(ofFloat);
                } else {
                    objectAnimator2.setValues(ofFloat, ofFloat2);
                }
                i5 = 0;
            } else {
                valueAnimator = valueAnimator3;
                i5 = 0;
                objectAnimator2.setPropertyName(f0.b.b(f10, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i5 = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? f6.getResourceId(i5, i5) : i5;
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(e(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        f6.recycle();
        if (f10 != null) {
            f10.recycle();
        }
        return valueAnimator2;
    }

    public static Interpolator e(Context context, int i5) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, i5);
        if (loadInterpolator != null) {
            return loadInterpolator;
        }
        throw new NullPointerException("Failed to parse interpolator, no start tag found");
    }
}
