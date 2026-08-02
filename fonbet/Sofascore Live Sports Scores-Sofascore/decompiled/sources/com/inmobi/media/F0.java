package com.inmobi.media;

import android.app.Activity;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ec6;
import defpackage.joa;
import defpackage.ku3;
import defpackage.ypa;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class F0 {
    public static B0 b;
    public static ku3 e;
    public static ku3 f;
    public static final joa a = ypa.b(new ec6(13));
    public static final joa c = ypa.b(new ec6(14));
    public static final C0 d = new C0();

    public static void a(Activity activity, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str, boolean z, JSONObject jSONObject, C3475hi c3475hi) {
        activity.getClass();
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        jSONObject.getClass();
        c3475hi.getClass();
        gestureDetectorOnGestureListenerC3889xi.getAdQualityManager().a(activity, str, z, jSONObject, c3475hi);
        B0 b0 = b;
        if (b0 == null) {
            Intrinsics.i("executor");
            throw null;
        }
        str.getClass();
        c3475hi.getClass();
        b0.c.put(str, new WeakReference(c3475hi));
        String creativeID = gestureDetectorOnGestureListenerC3889xi.getCreativeID();
        if (creativeID.length() > 0) {
            AdConfig adConfig = (AdConfig) AbstractC3435g4.a.a(AdConfig.class);
            joa joaVar = c;
            if (((CopyOnWriteArrayList) joaVar.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) joaVar.getValue()).add(creativeID);
            }
        }
    }

    public static final CopyOnWriteArrayList b() {
        return new CopyOnWriteArrayList();
    }

    public static final I0 a() {
        return new I0(AbstractC3750s9.b());
    }

    public static void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2, String str, boolean z, JSONObject jSONObject, C3475hi c3475hi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        gestureDetectorOnGestureListenerC3889xi2.getClass();
        str.getClass();
        jSONObject.getClass();
        c3475hi.getClass();
        gestureDetectorOnGestureListenerC3889xi2.getAdQualityManager().a(gestureDetectorOnGestureListenerC3889xi, str, z, jSONObject, c3475hi);
        B0 b0 = b;
        if (b0 != null) {
            str.getClass();
            c3475hi.getClass();
            b0.c.put(str, new WeakReference(c3475hi));
            String creativeID = gestureDetectorOnGestureListenerC3889xi2.getCreativeID();
            if (creativeID.length() > 0) {
                AdConfig adConfig = (AdConfig) AbstractC3435g4.a.a(AdConfig.class);
                joa joaVar = c;
                if (((CopyOnWriteArrayList) joaVar.getValue()).size() < adConfig.getAdReport().getCridls()) {
                    ((CopyOnWriteArrayList) joaVar.getValue()).add(creativeID);
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.i("executor");
        throw null;
    }
}
