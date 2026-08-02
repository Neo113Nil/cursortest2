package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.compose.runtime.d;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.ironsource.V2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hz8 implements j1h {
    public static final Object a = new Object();
    public static final tc3 b = new tc3(-2067386824, new ed3(6), false);
    public static final tc3 c = new tc3(-248614819, new ed3(7), false);
    public static final tc3 d = new tc3(-134050271, new ed3(8), false);
    public static final tc3 e = new tc3(711985532, new pd3(6), false);
    public static final o55 f = new o55();
    public static final f8h g = new f8h(21);
    public static final StackTraceElement[] h = new StackTraceElement[0];
    public static final String[] i = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] j = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] k = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;

    public static int A(int i2) {
        ia0 ia0Var = ia0.q;
        if (!mz1.C() || i2 <= 7) {
            return 0;
        }
        return wt3.f(i2, 7, 10, 1);
    }

    public static final void B(View view, Long l2) {
        view.getClass();
        Object tag = view.getTag(R.id.expand_collapse_animator_tag);
        ValueAnimator valueAnimator = tag instanceof ValueAnimator ? (ValueAnimator) tag : null;
        if (view.getVisibility() == 8 && valueAnimator == null) {
            return;
        }
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getHeight(), 0);
        ofInt.setDuration(l2.longValue());
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new rh6(1, view));
        ofInt.addListener(new sh6(0, view));
        view.setTag(R.id.expand_collapse_animator_tag, ofInt);
        ofInt.start();
    }

    public static void C(View view, Long l2, int i2) {
        long j2;
        int i3 = (i2 & 1) != 0 ? 200 : 100;
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        view.getClass();
        Object tag = view.getTag(R.id.expand_collapse_animator_tag);
        ValueAnimator valueAnimator = tag instanceof ValueAnimator ? (ValueAnimator) tag : null;
        if (view.getVisibility() == 0 && valueAnimator == null) {
            return;
        }
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Object parent = view.getParent();
        parent.getClass();
        view.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getVisibility() == 0 ? view.getHeight() : 0, measuredHeight);
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            long j3 = (2 * ((long) (measuredHeight / view.getContext().getResources().getDisplayMetrics().density))) + i3;
            j2 = 300;
            if (j3 >= 300) {
                j2 = j3;
            }
        }
        ofInt.setDuration(j2);
        ofInt.setStartDelay(0L);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new rh6(0, view));
        ofInt.addListener(new sh6(2, view));
        ofInt.addListener(new sh6(1, view));
        view.setTag(R.id.expand_collapse_animator_tag, ofInt);
        ofInt.start();
    }

    public static final ko1 D(tc3 tc3Var, of3 of3Var, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && ((av8) of3Var).g(tc3Var)) || (i2 & 6) == 4;
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (z || O == a99Var) {
            O = new ko1(tc3Var);
            av8Var.n0(O);
        }
        ko1 ko1Var = (ko1) O;
        boolean g2 = av8Var.g(ko1Var);
        Object O2 = av8Var.O();
        if (g2 || O2 == a99Var) {
            O2 = new u2(ko1Var, 20);
            av8Var.n0(O2);
        }
        d(ko1Var, (Function1) O2, av8Var);
        return ko1Var;
    }

    public static final Bundle E(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.a;
            Object obj = pair.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        a70.p(bf3.k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    a70.p(bf3.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final qq3 F(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        ip5 ip5Var = new ip5(str, enumArr.length);
        int length = enumArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Enum r5 = enumArr[i2];
            int i4 = i3 + 1;
            String str2 = (String) ph0.F(i3, strArr);
            if (str2 == null) {
                str2 = r5.name();
            }
            ip5Var.j(str2, false);
            Annotation[] annotationArr2 = (Annotation[]) ph0.F(i3, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i5 = ip5Var.d;
                    List[] listArr = ip5Var.f;
                    List list = listArr[i5];
                    if (list == null) {
                        list = new ArrayList(1);
                        listArr[ip5Var.d] = list;
                    }
                    list.add(annotation);
                }
            }
            i2++;
            i3 = i4;
        }
        qq3 qq3Var = new qq3(str, enumArr);
        qq3Var.c = ip5Var;
        return qq3Var;
    }

    public static final ku3 G(CoroutineContext coroutineContext, of3 of3Var) {
        if (coroutineContext.get(uic.g) == null) {
            return new uwf(((av8) of3Var).R, coroutineContext);
        }
        aea a2 = bea.a();
        a2.V(new eb3(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return s9a.c(a2);
    }

    public static vl7 H(tl7 tl7Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        return new vl7(tl7Var, z5 ? new xl7(z7) : !z ? new zl7(bm7.Used) : z3 ? new zl7(bm7.OtherActive) : z4 ? new zl7(bm7.UnavailableInRound) : z6 ? new zl7(bm7.RoundLocked) : z8 ? new zl7(bm7.RoundIsPlaceholder) : yl7.a, z, z2);
    }

    public static final String I(qj qjVar) {
        if (qjVar instanceof pj) {
            return "Standard";
        }
        if (qjVar instanceof mj) {
            return "FullTime";
        }
        if (qjVar instanceof nj) {
            return "Handicap";
        }
        if (qjVar instanceof oj) {
            return "Multiple";
        }
        zzl.b();
        return null;
    }

    public static Map K() {
        return tub.h(new Pair(StatusKt.STATUS_NOT_STARTED, 0), new Pair(StatusKt.STATUS_IN_PROGRESS, 1), new Pair(StatusKt.STATUS_FINISHED, 2));
    }

    public static final int L(SerialDescriptor serialDescriptor, yea yeaVar, String str) {
        serialDescriptor.getClass();
        yeaVar.getClass();
        str.getClass();
        Q(yeaVar, serialDescriptor);
        int c2 = serialDescriptor.c(str);
        if (c2 != -3 || !yeaVar.a.j) {
            return c2;
        }
        j0l j0lVar = yeaVar.c;
        ij8 ij8Var = new ij8(20, serialDescriptor, yeaVar);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) j0lVar.b;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        f8h f8hVar = g;
        Object obj = map != null ? map.get(f8hVar) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 == null) {
            obj2 = ij8Var.invoke();
            Object obj3 = concurrentHashMap.get(serialDescriptor);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj3);
            }
            ((Map) obj3).put(f8hVar, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int M(SerialDescriptor serialDescriptor, yea yeaVar, String str, String str2) {
        serialDescriptor.getClass();
        yeaVar.getClass();
        str.getClass();
        int L = L(serialDescriptor, yeaVar, str);
        if (L != -3) {
            return L;
        }
        throw new v5h(serialDescriptor.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean N(yea yeaVar, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        yeaVar.getClass();
        if (yeaVar.a.b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof aga) {
                return true;
            }
        }
        return false;
    }

    public static final boolean O(of3 of3Var) {
        return (((Configuration) ((av8) of3Var).k(nz.a)).uiMode & 48) == 32;
    }

    public static final r4 P(Object[] objArr) {
        objArr.getClass();
        return new r4(objArr);
    }

    public static final void Q(yea yeaVar, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        yeaVar.getClass();
        Intrinsics.c(serialDescriptor.getKind(), nii.f);
    }

    public static bm2 R(Object obj) {
        String name;
        bm2 bm2Var = new bm2(1);
        if (!(obj instanceof Event)) {
            if (!(obj instanceof Stage)) {
                ilg.c();
                return null;
            }
            Stage stage = (Stage) obj;
            bm2Var.b = stage.getStartDateTimestamp();
            Stage stageEvent = stage.getStageEvent();
            bm2Var.c = stageEvent != null ? stageEvent.getId() : stage.getId();
            bm2Var.d = stage.getDescription();
            return bm2Var;
        }
        Event event = (Event) obj;
        bm2Var.b = event.getStartTimestamp();
        bm2Var.c = event.getTournament().getId();
        TeamSides teamSides = TeamSides.ORIGINAL;
        FieldTranslations fieldTranslations = event.getHomeTeam(teamSides).getFieldTranslations();
        if (fieldTranslations == null || (name = tba.r(fieldTranslations)) == null) {
            name = event.getHomeTeam(teamSides).getName();
        }
        bm2Var.d = name;
        return bm2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xvc T(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!sea.t(newPullParser, "x:xmpmeta")) {
            throw r9e.a("Couldn't find xmp metadata", null);
        }
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        long j2 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (sea.t(newPullParser, "rdf:Description")) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        break loop0;
                    }
                    String n2 = sea.n(newPullParser, i[i3]);
                    if (n2 == null) {
                        i3++;
                    } else {
                        if (Integer.parseInt(n2) != 1) {
                            break;
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 4) {
                                break;
                            }
                            String n3 = sea.n(newPullParser, j[i4]);
                            if (n3 != null) {
                                j2 = Long.parseLong(n3);
                            } else {
                                i4++;
                            }
                        }
                        j2 = -9223372036854775807L;
                        while (true) {
                            if (i2 >= 2) {
                                av9 av9Var2 = hv9.b;
                                vvfVar = vvf.e;
                                break;
                            }
                            String n4 = sea.n(newPullParser, k[i2]);
                            if (n4 != null) {
                                vvfVar = hv9.A(new vvc("image/jpeg", 0L, 0L), new vvc(MimeTypes.VIDEO_MP4, Long.parseLong(n4), 0L));
                                break;
                            }
                            i2++;
                        }
                    }
                }
            } else if (sea.t(newPullParser, "Container:Directory")) {
                vvfVar = U(newPullParser, "Container", "Item");
            } else if (sea.t(newPullParser, "GContainer:Directory")) {
                vvfVar = U(newPullParser, "GContainer", "GContainerItem");
            }
            if (sea.q(newPullParser, "x:xmpmeta")) {
                if (!vvfVar.isEmpty()) {
                    return new xvc(j2, vvfVar);
                }
            }
        }
        return null;
    }

    public static vvf U(XmlPullParser xmlPullParser, String str, String str2) {
        zu9 s = hv9.s();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (sea.t(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String n2 = sea.n(xmlPullParser, concat3);
                String n3 = sea.n(xmlPullParser, concat4);
                String n4 = sea.n(xmlPullParser, concat5);
                String n5 = sea.n(xmlPullParser, concat6);
                if (n2 == null || n3 == null) {
                    return vvf.e;
                }
                s.c(new vvc(n2, n4 != null ? Long.parseLong(n4) : 0L, n5 != null ? Long.parseLong(n5) : 0L));
            }
        } while (!sea.q(xmlPullParser, concat2));
        return s.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument(C.UTF8_NAME, Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                } catch (Exception unused) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        if (r5 != 4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String X(Context context) {
        String str;
        synchronized (a) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, C.UTF8_NAME);
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 3 && newPullParser.getDepth() <= depth) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (str.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                    return str;
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return str;
    }

    public static final void a(int i2, int i3, long j2, of3 of3Var, xtc xtcVar, String str, boolean z) {
        int i4;
        String str2;
        xtc xtcVar2;
        xtc xtcVar3;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1923854958);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i4 |= av8Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.h(z) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i5 |= av8Var.f(j2) ? 16384 : 8192;
        }
        int i6 = i5;
        if (av8Var.T(i6 & 1, (i6 & 9363) != 9362)) {
            av8Var.Y();
            if ((i3 & 1) == 0 || av8Var.B()) {
                xtcVar3 = utc.a;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
            }
            av8Var.t();
            Context context = (Context) av8Var.k(nz.b);
            ImageVector N = s6a.N(z ? R.drawable.ic_notification_active : R.drawable.ic_notification_deselected, 6, av8Var);
            xtc l2 = bkh.l(xtcVar3, 24.0f);
            boolean i7 = ((i6 & 14) == 4) | ((i6 & 896) == 256) | av8Var.i(context) | ((i6 & 112) == 32);
            Object O = av8Var.O();
            if (i7 || O == nf3.a) {
                q93 q93Var = new q93(z, context, i2, str2, 0);
                av8Var.n0(q93Var);
                O = q93Var;
            }
            kq9.b(N, null, tol.n(l2, 0.75f, (Function0) O, 2), j2, av8Var, ((i6 >> 3) & 7168) | 48, 0);
            xtcVar2 = xtcVar3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r93(i2, str, z, xtcVar2, j2, i3, 0);
        }
    }

    public static final void b(Object obj, Object obj2, Function1 function1, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        boolean g2 = av8Var.g(obj) | av8Var.g(obj2);
        Object O = av8Var.O();
        if (g2 || O == nf3.a) {
            O = new m55(function1);
            av8Var.n0(O);
        }
    }

    public static final void d(Object obj, Function1 function1, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        boolean g2 = av8Var.g(obj);
        Object O = av8Var.O();
        if (g2 || O == nf3.a) {
            O = new m55(function1);
            av8Var.n0(O);
        }
    }

    public static final void h(Object[] objArr, Function1 function1, of3 of3Var) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((av8) of3Var).g(obj);
        }
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (z || O == nf3.a) {
            av8Var.n0(new m55(function1));
        }
    }

    public static final long i(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void j(hzh hzhVar, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-259036474);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(hzhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if (av8Var.T(i6 & 1, (i6 & 19) != 18)) {
            Integer num = hzhVar.e;
            boolean z = num != null && num.intValue() > 0;
            if (hzhVar.b) {
                i4 = 174060027;
                i5 = R.color.primary_highlight;
            } else {
                i4 = 174061231;
                i5 = R.color.n_lv_5;
            }
            long f2 = ljg.f(av8Var, i4, i5, av8Var, false);
            n7g a2 = o7g.a(8.0f);
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(wnn.A(utcVar, a2), f2, oyn.e), 4.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-201413833);
            o80 o80Var = new o80();
            if (z) {
                av8Var.d0(833820665);
                int g2 = o80Var.g(new pwh(lz.D(R.color.live, av8Var), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                try {
                    o80Var.d(String.valueOf(hzhVar.e.intValue()));
                    Unit unit = Unit.a;
                    o80Var.f(g2);
                    o80Var.d(" / ");
                    av8Var.s(false);
                } catch (Throwable th) {
                    o80Var.f(g2);
                    throw th;
                }
            } else {
                av8Var.d0(834026319);
                av8Var.s(false);
            }
            o80Var.d(String.valueOf(hzhVar.f));
            q80 h2 = o80Var.h();
            av8Var.s(false);
            yf8 yf8Var = xth.a;
            udj.d(h2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, xth.e(), av8Var, 0, 0, 262138);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(hzhVar, xtcVar2, i2, 27);
        }
    }

    public static final void k(o07 o07Var, FantasyCompetitionType fantasyCompetitionType, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var;
        o07Var.getClass();
        fantasyCompetitionType.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(897866254);
        int i3 = (av8Var2.g(o07Var) ? 4 : 2) | i2 | (av8Var2.e(fantasyCompetitionType.ordinal()) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            av8Var = av8Var2;
            wkn.a(Boolean.valueOf(o07Var.c), null, null, null, yqo.H(-1464464499, av8Var2, new er6(o07Var, fantasyCompetitionType, (Context) av8Var2.k(nz.b), function0, 2)), av8Var, 24576, 14);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(o07Var, fantasyCompetitionType, function0, i2, 3);
        }
    }

    public static final void l(int i2, of3 of3Var, xtc xtcVar, ImageVector imageVector, String str, String str2, Function0 function0, boolean z) {
        xtc xtcVar2;
        int i3;
        int i4;
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1443366716);
        int i5 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.g(imageVector) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192) | 196608;
        if (av8Var.T(i5 & 1, (i5 & 74899) != 74898)) {
            n7g a2 = o7g.a(8.0f);
            if (z) {
                i3 = 199032313;
                i4 = R.color.primary_default_10;
            } else {
                i3 = 199033169;
                i4 = R.color.surface_2;
            }
            cdi a3 = wih.a(ljg.f(av8Var, i3, i4, av8Var, false), null, "background_color", av8Var, 384, 10);
            if (z) {
                j2 = ljg.f(av8Var, 199037623, R.color.primary_default, av8Var, false);
            } else {
                av8Var.d0(199038607);
                av8Var.s(false);
                j2 = r13.h;
            }
            cdi a4 = wih.a(j2, null, "border_color", av8Var, 384, 10);
            cdi a5 = wih.a(z ? ljg.f(av8Var, 199042775, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 199043565, R.color.n_lv_1, av8Var, false), null, "icon_tint", av8Var, 384, 10);
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(bkh.d(utcVar, 1.0f), a2), ((r13) a3.getValue()).a, a2);
            qz1 H = fcp.H(((r13) a4.getValue()).a, 2.0f);
            xtc b0 = l98.b0(tol.y(yso.p(q, H.a, H.b, a2), false, false, false, 0L, null, function0, av8Var, 27), 16.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a6 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(imageVector, null, bkh.l(utcVar, 24.0f), ((r13) a5.getValue()).a, av8Var, ((i5 >> 6) & 14) | 432, 0);
            goa goaVar = new goa(1.0f, true);
            u23 a7 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a7, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, i5 & 14, 24960, 110586);
            udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, (i5 >> 3) & 14, 0, 131066);
            av8Var.s(true);
            av8Var.s(true);
            fz8.e(z, n12.a.a(utcVar, uxf.e), uo5.e(null, 3).a(uo5.g(null, 0.7f, 5)), uo5.f(null, 3).a(uo5.h(null, 0.7f, 5)), null, rz8.d, av8Var, ((i5 >> 9) & 14) | 200064, 16);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i67(str, str2, imageVector, z, function0, xtcVar2, i2);
        }
    }

    public static final void m(FantasyLeagueGameType fantasyLeagueGameType, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        boolean z;
        fantasyLeagueGameType.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(927956219);
        int i4 = i2 | (av8Var.e(fantasyLeagueGameType.ordinal()) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            rha.b(oea.v(R.string.fantasy_choose_league_type, av8Var), null, 0L, av8Var, 0, 6);
            String v = oea.v(R.string.fantasy_classic_league, av8Var);
            String v2 = oea.v(R.string.fantasy_classic_league_description, av8Var);
            ImageVector N = s6a.N(R.drawable.ic_leagues_empty, 6, av8Var);
            if (fantasyLeagueGameType == FantasyLeagueGameType.CLASSIC) {
                i3 = 6;
                z = true;
            } else {
                i3 = 6;
                z = false;
            }
            int i5 = i4 & 112;
            boolean z2 = i5 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new rt6(21, function1);
                av8Var.n0(O);
            }
            l(0, av8Var, null, N, v, v2, (Function0) O, z);
            String v3 = oea.v(R.string.fantasy_h2h_league, av8Var);
            String v4 = oea.v(R.string.fantasy_h2h_league_description, av8Var);
            ImageVector N2 = s6a.N(R.drawable.ic_fantasy_h2h, i3, av8Var);
            boolean z3 = fantasyLeagueGameType == FantasyLeagueGameType.HEAD_TO_HEAD;
            boolean z4 = i5 == 32;
            Object O2 = av8Var.O();
            if (z4 || O2 == a99Var) {
                O2 = new rt6(22, function1);
                av8Var.n0(O2);
            }
            l(0, av8Var, null, N2, v3, v4, (Function0) O2, z3);
            String v5 = oea.v(R.string.fantasy_league_type_note, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v5, l98.f0(bkh.d(utc.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(fantasyLeagueGameType, function1, xtcVar, i2, 8);
        }
    }

    public static final void n(gv9 gv9Var, yq7 yq7Var, gv9 gv9Var2, Function1 function1, of3 of3Var, int i2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2113023653);
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.e(yq7Var == null ? -1 : yq7Var.ordinal()) ? 32 : 16) | (av8Var.i(gv9Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            boolean g2 = av8Var.g(a2);
            Object O = av8Var.O();
            int i4 = 10;
            a99 a99Var = nf3.a;
            rq3 rq3Var = null;
            if (g2 || O == a99Var) {
                O = new ck1(i4, rq3Var, a2);
                av8Var.n0(O);
            }
            int i5 = i3 >> 3;
            q(yq7Var, gv9Var2, (Function2) O, av8Var);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            av8Var.d0(797554520);
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                yq7 yq7Var2 = (yq7) it.next();
                arrayList.add(new vt2(yq7Var2.name(), oea.v(yq7Var2.a, av8Var), false, null, null, null, null, 252));
            }
            av8Var.s(false);
            trh.a(l6g.W(arrayList), yq7Var != null ? yq7Var.name() : null, function1, f0, null, null, jrh.m, false, false, true, null, null, av8Var, (i5 & 896) | 806882304, V2.b.f);
            av8Var = av8Var;
            xtc d2 = bkh.d(utcVar, 1.0f);
            t3e C2 = l98.C(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            boolean i6 = av8Var.i(gv9Var2) | av8Var.i(context);
            Object O2 = av8Var.O();
            if (i6 || O2 == a99Var) {
                O2 = new w47(29, context, (Object) gv9Var2);
                av8Var.n0(O2);
            }
            v8a.c(d2, a2, C2, null, null, null, false, null, (Function1) O2, av8Var, 100663686, 248);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 29, gv9Var, yq7Var, gv9Var2, function1);
        }
    }

    public static final void o(of3 of3Var, Object obj, Function2 function2) {
        CoroutineContext coroutineContext = ((av8) of3Var).R;
        av8 av8Var = (av8) of3Var;
        boolean g2 = av8Var.g(obj);
        Object O = av8Var.O();
        if (g2 || O == nf3.a) {
            O = new lla(coroutineContext, function2);
            av8Var.n0(O);
        }
    }

    public static final void p(Object obj, Object obj2, Object obj3, Function2 function2, of3 of3Var) {
        CoroutineContext coroutineContext = ((av8) of3Var).R;
        av8 av8Var = (av8) of3Var;
        boolean g2 = av8Var.g(obj) | av8Var.g(obj2) | av8Var.g(obj3);
        Object O = av8Var.O();
        if (g2 || O == nf3.a) {
            O = new lla(coroutineContext, function2);
            av8Var.n0(O);
        }
    }

    public static final void q(Object obj, Object obj2, Function2 function2, of3 of3Var) {
        CoroutineContext coroutineContext = ((av8) of3Var).R;
        av8 av8Var = (av8) of3Var;
        boolean g2 = av8Var.g(obj) | av8Var.g(obj2);
        Object O = av8Var.O();
        if (g2 || O == nf3.a) {
            O = new lla(coroutineContext, function2);
            av8Var.n0(O);
        }
    }

    public static final void r(Object[] objArr, Function2 function2, of3 of3Var) {
        CoroutineContext coroutineContext = ((av8) of3Var).R;
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((av8) of3Var).g(obj);
        }
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (z || O == nf3.a) {
            av8Var.n0(new lla(coroutineContext, function2));
        }
    }

    public static final void s(xtc xtcVar, d dVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        tc3 tc3Var2 = s02.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(tc3Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(tc3Var) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.e(null, f7a.k);
                av8Var.n0(O);
            }
            ko1 D = D(tc3Var2, av8Var, (i3 >> 6) & 14);
            tol.b(dVar.a(D), yqo.H(274270255, av8Var, new ace(xtcVar, (e1d) O, tc3Var, D, 3)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(xtcVar, dVar, tc3Var, i2, 6);
        }
    }

    public static final void t(Function0 function0, of3 of3Var) {
        evd evdVar = ((av8) of3Var).M.b.k;
        evdVar.l0(sud.c);
        wba.H(evdVar, 0, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v27 */
    public static final void u(hzh hzhVar, boolean z, boolean z2, xtc xtcVar, Function0 function0, of3 of3Var, int i2, int i3) {
        Function0 function02;
        int i4;
        Function0 function03;
        av8 av8Var;
        int i5;
        Function0 function04;
        jf9 jf9Var;
        r9k r9kVar;
        boolean z3;
        long j2;
        utc utcVar;
        xtc xtcVar2;
        av8 av8Var2;
        long j3;
        String a2;
        av8 av8Var3;
        ?? r6;
        boolean z4;
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(-1636990447);
        int i6 = (av8Var4.g(hzhVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i6 |= av8Var4.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= av8Var4.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i6 | (av8Var4.g(xtcVar) ? a.o : 1024);
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 = i7 | 24576;
            function02 = function0;
        } else {
            function02 = function0;
            i4 = i7 | (av8Var4.i(function02) ? 16384 : 8192);
        }
        if (av8Var4.T(i4 & 1, (i4 & 9363) != 9362)) {
            Function0 function05 = i8 != 0 ? null : function02;
            boolean z5 = hzhVar.b;
            r9k r9kVar2 = hzhVar.g;
            long f2 = z5 ? ljg.f(av8Var4, 1771489396, R.color.surface_2, av8Var4, false) : ljg.f(av8Var4, 1771524116, R.color.surface_1, av8Var4, false);
            av8Var4.d0(-1189774109);
            xtc e2 = bkh.e(bkh.d(xtcVar, 1.0f), 48.0f);
            jf9 jf9Var2 = oyn.e;
            xtc q = n9e.q(e2, f2, jf9Var2);
            utc utcVar2 = utc.a;
            if (z || function05 == null) {
                i5 = i4;
                function04 = function05;
                jf9Var = jf9Var2;
                r9kVar = r9kVar2;
                z3 = false;
                j2 = f2;
                utcVar = utcVar2;
                xtcVar2 = q;
                av8Var2 = av8Var4;
            } else {
                long D = lz.D(R.color.n_lv_4, av8Var4);
                Object O = av8Var4.O();
                a99 a99Var = nf3.a;
                Object obj = O;
                if (O == a99Var) {
                    obj = mz1.e(av8Var4);
                }
                wzc wzcVar = (wzc) obj;
                i5 = i4;
                Object[] objArr = new Object[0];
                Object O2 = av8Var4.O();
                Object obj2 = O2;
                if (O2 == a99Var) {
                    nuh nuhVar = nuh.d;
                    av8Var4.n0(nuhVar);
                    obj2 = nuhVar;
                }
                long j4 = f2;
                cyg cygVar = new cyg((boh) o3a.N(objArr, (Function0) obj2, av8Var4, 48), function05, 12);
                function04 = function05;
                jf9Var = jf9Var2;
                r9kVar = r9kVar2;
                j2 = j4;
                z3 = false;
                xtc y = tol.y(utcVar2, true, true, true, D, wzcVar, cygVar, av8Var4, 0);
                av8Var2 = av8Var4;
                utcVar = utcVar2;
                xtcVar2 = q.z(y);
            }
            av8Var2.s(z3);
            k1c c2 = e12.c(uxf.c, z3);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            boolean z6 = hzhVar.b;
            n12 n12Var = n12.a;
            if (z6) {
                av8Var2.d0(-873987928);
                j3 = j2;
                e12.a(0, av8Var2, n9e.q(bkh.c(bkh.p(n12Var.a(utcVar, uxf.f), 4.0f), 1.0f), lz.D(R.color.primary_default, av8Var2), jf9Var));
                av8Var2.s(false);
            } else {
                j3 = j2;
                av8Var2.d0(-873739029);
                av8Var2.s(z3);
            }
            lv1 lv1Var = uxf.m;
            xtc d0 = l98.d0(bkh.c, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            kq9.b(s6a.N(hzhVar.d, 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var2), av8Var2, 432, 0);
            nq8.h(av8Var2, bkh.p(utcVar, 16.0f));
            kg0 kg0Var = ww9.f;
            goa goaVar = new goa(1.0f, true);
            u23 a4 = t23.a(kg0Var, uxf.o, av8Var2, 6);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, goaVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            r9k r9kVar3 = hzhVar.c;
            if (r9kVar3 == null) {
                av8Var2.d0(-2071395322);
                av8Var2.s(false);
                a2 = null;
            } else {
                av8Var2.d0(-1175197861);
                a2 = r9kVar3.a(av8Var2);
                av8Var2.s(false);
            }
            if (a2 == null) {
                a2 = "";
            }
            String str = a2;
            yf8 yf8Var = xth.a;
            av8 av8Var5 = av8Var2;
            utc utcVar3 = utcVar;
            q5a.w(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.e(), av8Var5, 0, 24960, 110586);
            av8 av8Var6 = av8Var5;
            if (r9kVar != null) {
                av8Var6.d0(-2071089568);
                q5a.w(r9kVar.a(av8Var6), null, lz.D(R.color.value, av8Var6), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.n(), av8Var6, 0, 24960, 110586);
                av8 av8Var7 = av8Var6;
                av8Var7.s(false);
                av8Var3 = av8Var7;
            } else {
                av8Var6.d0(-2070778607);
                av8Var6.s(false);
                av8Var3 = av8Var6;
            }
            av8Var3.s(true);
            if (z2 || Intrinsics.c(hzhVar.a, mzh.a)) {
                r6 = 0;
                av8Var3.d0(1244230087);
                av8Var3.s(false);
            } else {
                av8Var3.d0(1243748626);
                if (z) {
                    av8Var3.d0(1243803806);
                    kq9.b(s6a.N(R.drawable.ic_reorder, 6, av8Var3), null, bkh.l(utcVar3, 24.0f), lz.D(R.color.primary_default, av8Var3), av8Var3, 432, 0);
                    z4 = false;
                    av8Var3.s(false);
                } else {
                    z4 = false;
                    z4 = false;
                    if (hzhVar.f != null) {
                        av8Var3.d0(732870541);
                        j(hzhVar, null, av8Var3, i5 & 14);
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(1244216199);
                        av8Var3.s(false);
                    }
                }
                av8Var3.s(z4);
                r6 = z4;
            }
            av8Var3.s(true);
            if (z2) {
                av8Var3.d0(-871742350);
                e12.a(r6, av8Var3, n9e.q(n12Var.b(utcVar3), r13.c(j3, 0.7f), jf9Var));
                av8Var3.s(r6);
            } else {
                av8Var3.d0(-871564565);
                av8Var3.s(r6);
            }
            av8Var3.s(true);
            function03 = function04;
            av8Var = av8Var3;
        } else {
            av8Var4.W();
            function03 = function02;
            av8Var = av8Var4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e82(hzhVar, z, z2, xtcVar, function03, i2, i3);
        }
    }

    public static final void v(List list, Function2 function2, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        boolean z2;
        int i3;
        a99 a99Var;
        float f2;
        Integer num;
        float f3;
        xnh xnhVar;
        g28 g28Var;
        e1d e1dVar;
        a99 a99Var2;
        utc utcVar;
        Boolean bool;
        xtc xtcVar2;
        List list2 = list;
        list2.getClass();
        function2.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-73785464);
        int i4 = i2 | (av8Var2.i(list2) ? 4 : 2) | (av8Var2.i(function2) ? 32 : 16) | (av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.h(z) ? a.o : 1024) | (av8Var2.g(xtcVar) ? 16384 : 8192);
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            ksa a2 = msa.a(0, 0, av8Var2, 0, 3);
            z69 z69Var = (z69) av8Var2.k(dh3.l);
            Object O = av8Var2.O();
            a99 a99Var3 = nf3.a;
            if (O == a99Var3) {
                O = e.f(null);
                av8Var2.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            Object O2 = av8Var2.O();
            if (O2 == a99Var3) {
                O2 = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var2.n0(O2);
            }
            xnh xnhVar2 = (xnh) O2;
            Object O3 = av8Var2.O();
            if (O3 == a99Var3) {
                O3 = e.f(null);
                av8Var2.n0(O3);
            }
            e1d e1dVar3 = (e1d) O3;
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            boolean z3 = av8Var2.k(dh3.n) == ema.b;
            e1d e1dVar4 = e1dVar2;
            float H0 = kx4Var.H0(48.0f);
            float H02 = kx4Var.H0(80.0f);
            boolean g2 = av8Var2.g(kx4Var);
            Object O4 = av8Var2.O();
            if (g2 || O4 == a99Var3) {
                O4 = Float.valueOf(kx4Var.H0(48.0f));
                av8Var2.n0(O4);
            }
            float floatValue = ((Number) O4).floatValue();
            int i5 = i4;
            float H03 = kx4Var.H0(10.0f);
            Integer num2 = (Integer) e1dVar4.getValue();
            int i6 = i5 & 112;
            boolean g3 = av8Var2.g(a2) | av8Var2.d(H0) | av8Var2.d(H02) | av8Var2.d(H03) | av8Var2.i(list2) | (i6 == 32) | av8Var2.i(z69Var);
            Object O5 = av8Var2.O();
            if (g3 || O5 == a99Var3) {
                z2 = z3;
                i3 = i6;
                a99Var = a99Var3;
                f2 = floatValue;
                num = num2;
                O5 = new uzh(a2, e1dVar4, H0, H02, H03, xnhVar2, list2, function2, z69Var, null);
                f3 = H0;
                xnhVar = xnhVar2;
                a2 = a2;
                list2 = list2;
                av8Var2.n0(O5);
            } else {
                z2 = z3;
                a99Var = a99Var3;
                i3 = i6;
                num = num2;
                f3 = H0;
                f2 = floatValue;
                xnhVar = xnhVar2;
            }
            o(av8Var2, num, (Function2) O5);
            av8Var2.d0(2106760467);
            g28 g28Var2 = bkh.c;
            xtc z4 = xtcVar.z(g28Var2);
            utc utcVar2 = utc.a;
            if (z) {
                Boolean valueOf = Boolean.valueOf(z);
                boolean h2 = ((i5 & 7168) == 2048) | av8Var2.h(z2) | av8Var2.d(f2) | av8Var2.g(a2) | av8Var2.i(list2) | av8Var2.i(z69Var) | av8Var2.d(f3) | (i3 == 32);
                Object O6 = av8Var2.O();
                a99 a99Var4 = a99Var;
                if (h2 || O6 == a99Var4) {
                    i5 = i5;
                    a99Var2 = a99Var4;
                    g28Var = g28Var2;
                    utcVar = utcVar2;
                    bool = valueOf;
                    List list3 = list2;
                    boolean z5 = z2;
                    xtcVar2 = z4;
                    wzh wzhVar = new wzh(z5, f2, z, list3, z69Var, a2, e1dVar4, xnhVar, e1dVar3, f3, function2);
                    list2 = list3;
                    e1dVar4 = e1dVar4;
                    e1dVar = e1dVar3;
                    av8Var2.n0(wzhVar);
                    O6 = wzhVar;
                } else {
                    i5 = i5;
                    a99Var2 = a99Var4;
                    g28Var = g28Var2;
                    xtcVar2 = z4;
                    e1dVar = e1dVar3;
                    utcVar = utcVar2;
                    bool = valueOf;
                }
                z4 = xtcVar2.z(koi.a(utcVar, bool, (PointerInputEventHandler) O6));
            } else {
                g28Var = g28Var2;
                e1dVar = e1dVar3;
                a99Var2 = a99Var;
                utcVar = utcVar2;
            }
            av8Var2.s(false);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, z4);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            long D = lz.D(R.color.surface_1, av8Var2);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(g28Var, D, jf9Var);
            int i7 = i5;
            boolean i8 = av8Var2.i(list2) | ((i7 & 7168) == 2048) | ((i7 & 896) == 256);
            Object O7 = av8Var2.O();
            a99 a99Var5 = a99Var2;
            if (i8 || O7 == a99Var5) {
                c30 c30Var = new c30(list2, z, function1, e1dVar4, 5);
                av8Var2.n0(c30Var);
                O7 = c30Var;
            }
            xnh xnhVar3 = xnhVar;
            av8Var = av8Var2;
            v8a.a(q, a2, null, null, null, null, false, null, (Function1) O7, av8Var, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
            hzh hzhVar = (hzh) e1dVar.getValue();
            if (hzhVar == null || !z) {
                av8Var.d0(743696404);
                av8Var.s(false);
            } else {
                av8Var.d0(743133258);
                xtc G = mha.G(bkh.d(bkh.e(utcVar, 48.0f), 1.0f), 1.0f);
                Object O8 = av8Var.O();
                if (O8 == a99Var5) {
                    O8 = new qfg(xnhVar3, 27);
                    av8Var.n0(O8);
                }
                u(hzhVar, true, false, n9e.q(d2a.E(rd0.M(G, (Function1) O8), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_1, av8Var), jf9Var), null, av8Var, 432, 16);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(list, function2, function1, z, xtcVar, i2, 13);
        }
    }

    public static final void w(float f2, List list, Function2 function2, z69 z69Var, e1d e1dVar, xnh xnhVar, ksa ksaVar) {
        Integer y;
        int intValue;
        Integer num = (Integer) e1dVar.getValue();
        if (num != null) {
            int intValue2 = num.intValue();
            dsa x = x(ksaVar, (f2 / 2.0f) + xnhVar.h());
            if (x == null || (y = y(list, x.k)) == null || intValue2 == (intValue = y.intValue()) || Intrinsics.c(((hzh) list.get(intValue)).a, mzh.a)) {
                return;
            }
            function2.invoke(num, y);
            e1dVar.setValue(y);
            ((kie) z69Var).a(9);
        }
    }

    public static final dsa x(ksa ksaVar, float f2) {
        Object obj;
        Iterator it = ksaVar.j().k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f2 >= ((dsa) obj).o && f2 <= r2 + r1.p) {
                break;
            }
        }
        return (dsa) obj;
    }

    public static final Integer y(List list, Object obj) {
        String obj2 = obj.toString();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.c(((hzh) it.next()).a.getSportSlug(), obj2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static final void z(xbb xbbVar, Context context, int i2, Double d2) {
        ezg.a(xbbVar, context, i2, d2 != null ? rei.a(Double.valueOf(d2.doubleValue()), true) : null);
    }

    public abstract void J(sbh sbhVar, float f2, float f3);

    public abstract int S(int i2);

    public abstract int W(int i2);

    @Override // defpackage.j1h
    public int c(int i2) {
        int S = S(i2);
        if (S == -1 || S(S) == -1) {
            return -1;
        }
        return S;
    }

    @Override // defpackage.j1h
    public int e(int i2) {
        return W(i2);
    }

    @Override // defpackage.j1h
    public int f(int i2) {
        return S(i2);
    }

    @Override // defpackage.j1h
    public int g(int i2) {
        int W = W(i2);
        if (W == -1 || W(W) == -1) {
            return -1;
        }
        return W;
    }
}
