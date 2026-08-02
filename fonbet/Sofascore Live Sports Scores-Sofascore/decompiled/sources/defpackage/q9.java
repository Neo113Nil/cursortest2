package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Intent;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorSpace;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class q9 {
    public static boolean A(q5b q5bVar, PreviewableHandwritingGesture previewableHandwritingGesture, tbj tbjVar, CancellationSignal cancellationSignal) {
        q80 q80Var = q5bVar.j;
        if (q80Var != null) {
            bej d = q5bVar.d();
            if (q80Var.equals(d != null ? d.a.a.a : null)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (tbjVar != null) {
                        long K = m6k.K(q5bVar, wba.P(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        q5b q5bVar2 = tbjVar.d;
                        if (q5bVar2 != null) {
                            q5bVar2.f(K);
                        }
                        q5b q5bVar3 = tbjVar.d;
                        if (q5bVar3 != null) {
                            q5bVar3.e(pej.b);
                        }
                        if (!pej.d(K)) {
                            tbjVar.u(false);
                            tbjVar.r(p69.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (tbjVar != null) {
                        long K2 = m6k.K(q5bVar, wba.P(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        q5b q5bVar4 = tbjVar.d;
                        if (q5bVar4 != null) {
                            q5bVar4.e(K2);
                        }
                        q5b q5bVar5 = tbjVar.d;
                        if (q5bVar5 != null) {
                            q5bVar5.f(pej.b);
                        }
                        if (!pej.d(K2)) {
                            tbjVar.u(false);
                            tbjVar.r(p69.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (tbjVar != null) {
                        long M = m6k.M(q5bVar, wba.P(selectRangeGesture.getSelectionStartArea()), wba.P(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        q5b q5bVar6 = tbjVar.d;
                        if (q5bVar6 != null) {
                            q5bVar6.f(M);
                        }
                        q5b q5bVar7 = tbjVar.d;
                        if (q5bVar7 != null) {
                            q5bVar7.e(pej.b);
                        }
                        if (!pej.d(M)) {
                            tbjVar.u(false);
                            tbjVar.r(p69.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (tbjVar != null) {
                        long M2 = m6k.M(q5bVar, wba.P(deleteRangeGesture.getDeletionStartArea()), wba.P(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        q5b q5bVar8 = tbjVar.d;
                        if (q5bVar8 != null) {
                            q5bVar8.e(M2);
                        }
                        q5b q5bVar9 = tbjVar.d;
                        if (q5bVar9 != null) {
                            q5bVar9.f(pej.b);
                        }
                        if (!pej.d(M2)) {
                            tbjVar.u(false);
                            tbjVar.r(p69.a);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new ye3(tbjVar, 2));
                }
                return true;
            }
        }
        return false;
    }

    public static boolean B(jwj jwjVar, PreviewableHandwritingGesture previewableHandwritingGesture, cej cejVar, CancellationSignal cancellationSignal) {
        int i = 1;
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            t(jwjVar, m6k.L(cejVar, wba.P(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            t(jwjVar, m6k.L(cejVar, wba.P(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            t(jwjVar, m6k.N(cejVar, wba.P(selectRangeGesture.getSelectionStartArea()), wba.P(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            t(jwjVar, m6k.N(cejVar, wba.P(deleteRangeGesture.getDeletionStartArea()), wba.P(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new ye3(jwjVar, i));
        }
        return true;
    }

    public static Bitmap C(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = ez8.a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    w1a.k("", gainmapContents.getConfig() == config2);
                    Bitmap createBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(ez8.a);
                    canvas.drawBitmap(gainmapContents, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmap2 = new Gainmap(createBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmap2;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    public static void D(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e) {
            Objects.toString(pendingIntent);
            e.toString();
        }
    }

    public static void E(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void F(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void G(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(b.j(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(ph0.a0(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void H(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void I(MediaRouter2 mediaRouter2, RouteListingPreference routeListingPreference) {
        mediaRouter2.setRouteListingPreference(routeListingPreference);
    }

    public static void J(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static void K(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    public static boolean L(MediaRouter2 mediaRouter2) {
        return mediaRouter2.showSystemOutputSwitcher();
    }

    public static RouteListingPreference M(a8g a8gVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = a8gVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(new RouteListingPreference.Item.Builder(((z7g) it.next()).a).setFlags(0).setSubText(0).setCustomSubtextMessage(null).setSelectionBehavior(1).build());
        }
        return new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(null).setUseSystemOrdering(a8gVar.b).build();
    }

    public static final void a(CursorAnchorInfo.Builder builder, aej aejVar, oqf oqfVar) {
        if (oqfVar.h()) {
            return;
        }
        eyc eycVar = aejVar.b;
        int i = eycVar.f - 1;
        if (i < 0) {
            i = 0;
        }
        int c = llf.c(eycVar.e(oqfVar.b), 0, i);
        int c2 = llf.c(eycVar.e(oqfVar.d), 0, i);
        if (c > c2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(aejVar.f(c), eycVar.f(c), aejVar.g(c), eycVar.b(c));
            if (c == c2) {
                return;
            } else {
                c++;
            }
        }
    }

    public static final void b(CursorAnchorInfo.Builder builder, aej aejVar, oqf oqfVar) {
        if (oqfVar.h()) {
            return;
        }
        eyc eycVar = aejVar.b;
        int i = eycVar.f - 1;
        if (i < 0) {
            i = 0;
        }
        int c = llf.c(eycVar.e(oqfVar.b), 0, i);
        int c2 = llf.c(eycVar.e(oqfVar.d), 0, i);
        if (c > c2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(aejVar.f(c), eycVar.f(c), aejVar.g(c), eycVar.b(c));
            if (c == c2) {
                return;
            } else {
                c++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r4 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(InputStream inputStream, BitmapFactory.Options options, et9 et9Var) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i == 34) {
            if ((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) o02.f.get()).booleanValue() : false) {
                try {
                    z = et9Var.f();
                } catch (IOException unused) {
                    z = false;
                }
                if (z) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    w1a.k("", config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        if (decodeStream != null) {
                            try {
                                bitmap = C(decodeStream);
                            } catch (Throwable th) {
                                th = th;
                                bitmap = decodeStream;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                        }
                        decodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static ex8 d(Intent intent) {
        intent.getClass();
        GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        type.getClass();
        return td4.x0(getCredentialException.getMessage(), type);
    }

    public static gx8 e(Intent intent) {
        intent.getClass();
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        return new gx8(o1j.v(data, type));
    }

    public static int f(jwj jwjVar, HandwritingGesture handwritingGesture) {
        scj scjVar = jwjVar.a;
        q4a q4aVar = jwjVar.b;
        haj hajVar = haj.a;
        scjVar.b.a().q();
        l9j l9jVar = scjVar.b;
        l9jVar.h = null;
        jwjVar.l(l9jVar);
        scjVar.b(q4aVar, true, hajVar);
        scjVar.e(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        jwj.h(jwjVar, fallbackText, false, 12);
        return 5;
    }

    public static int g(HandwritingGesture handwritingGesture, mme mmeVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        mmeVar.invoke(new t43(fallbackText, 1));
        return 5;
    }

    public static JobScheduler h(JobScheduler jobScheduler) {
        JobScheduler forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        forNamespace.getClass();
        return forNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction i() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float j(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void k(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static Set m(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int[] n(ydj ydjVar, RectF rectF, int i, final t21 t21Var) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new k90(new c0l(3, ydjVar.f.getText(), ydjVar.k()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(ydjVar.f.getText(), ydjVar.a);
        }
        return ydjVar.f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: e10
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) t21.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int q(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int r(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static int s(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static void t(jwj jwjVar, long j, int i) {
        if (pej.d(j)) {
            scj scjVar = jwjVar.a;
            q4a q4aVar = jwjVar.b;
            haj hajVar = haj.a;
            scjVar.b.a().q();
            l9j l9jVar = scjVar.b;
            l9jVar.h = null;
            jwjVar.l(l9jVar);
            scjVar.b(q4aVar, true, hajVar);
            scjVar.e(true);
            return;
        }
        long e = jwjVar.e(j);
        scj scjVar2 = jwjVar.a;
        q4a q4aVar2 = jwjVar.b;
        haj hajVar2 = haj.a;
        scjVar2.b.a().q();
        l9j l9jVar2 = scjVar2.b;
        int i2 = (int) (e >> 32);
        int i3 = (int) (e & 4294967295L);
        mo2 mo2Var = l9jVar2.c;
        if (i2 >= i3) {
            a70.p(dmi.k(i2, i3, "Do not set reversed or empty range: ", " > "));
            return;
        }
        l9jVar2.h = new Pair(new adj(i), new pej(t6a.g(llf.c(i2, 0, mo2Var.length()), llf.c(i3, 0, mo2Var.length()))));
        scjVar2.b(q4aVar2, true, hajVar2);
        scjVar2.e(true);
    }

    public static boolean u(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean v(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final ColorSpace w(j23 j23Var) {
        if (Intrinsics.c(j23Var, l23.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.c(j23Var, l23.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static void x(long j, q80 q80Var, boolean z, mme mmeVar) {
        if (z) {
            j = m6k.q(j, q80Var);
        }
        int i = (int) (4294967295L & j);
        mmeVar.invoke(new y69(new vg5[]{new p9h(i, i), new zw4(pej.e(j), 0)}));
    }

    public static int y(q5b q5bVar, HandwritingGesture handwritingGesture, tbj tbjVar, hsk hskVar, mme mmeVar) {
        int i;
        bej d;
        bej d2;
        q80 q80Var = q5bVar.j;
        if (q80Var == null) {
            return 3;
        }
        bej d3 = q5bVar.d();
        if (!q80Var.equals(d3 != null ? d3.a.a.a : null)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long K = m6k.K(q5bVar, wba.P(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (pej.d(K)) {
                return g(selectGesture, mmeVar);
            }
            mmeVar.invoke(new p9h((int) (K >> 32), (int) (K & 4294967295L)));
            if (tbjVar != null) {
                tbjVar.e(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long K2 = m6k.K(q5bVar, wba.P(deleteGesture.getDeletionArea()), i2);
                if (pej.d(K2)) {
                    return g(deleteGesture, mmeVar);
                }
                x(K2, q80Var, i2 == 1, mmeVar);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long M = m6k.M(q5bVar, wba.P(deleteRangeGesture.getDeletionStartArea()), wba.P(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (pej.d(M)) {
                        return g(deleteRangeGesture, mmeVar);
                    }
                    x(M, q80Var, i3 == 1, mmeVar);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (hskVar == null) {
                        return g(joinOrSplitGesture, mmeVar);
                    }
                    long e0 = m6k.e0(joinOrSplitGesture.getJoinOrSplitPoint());
                    bej d4 = q5bVar.d();
                    int I = d4 != null ? m6k.I(d4.a.b, e0, q5bVar.c(), hskVar) : -1;
                    if (I == -1 || ((d2 = q5bVar.d()) != null && m6k.R(d2.a, I))) {
                        return g(joinOrSplitGesture, mmeVar);
                    }
                    long a0 = m6k.a0(q80Var, I);
                    if (!pej.d(a0)) {
                        x(a0, q80Var, false, mmeVar);
                        return 1;
                    }
                    int i4 = (int) (a0 >> 32);
                    mmeVar.invoke(new y69(new vg5[]{new p9h(i4, i4), new t43(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (hskVar == null) {
                        return g(insertGesture, mmeVar);
                    }
                    long e02 = m6k.e0(insertGesture.getInsertionPoint());
                    bej d5 = q5bVar.d();
                    int I2 = d5 != null ? m6k.I(d5.a.b, e02, q5bVar.c(), hskVar) : -1;
                    if (I2 == -1 || ((d = q5bVar.d()) != null && m6k.R(d.a, I2))) {
                        return g(insertGesture, mmeVar);
                    }
                    mmeVar.invoke(new y69(new vg5[]{new p9h(I2, I2), new t43(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                bej d6 = q5bVar.d();
                long J = m6k.J(d6 != null ? d6.a : null, m6k.e0(removeSpaceGesture.getStartPoint()), m6k.e0(removeSpaceGesture.getEndPoint()), q5bVar.c(), hskVar);
                if (pej.d(J)) {
                    return g(removeSpaceGesture, mmeVar);
                }
                dsf dsfVar = new dsf();
                dsfVar.a = -1;
                dsf dsfVar2 = new dsf();
                dsfVar2.a = -1;
                String g = new Regex("\\s+").g(t6a.K(J, q80Var), new x69(dsfVar, dsfVar2, r12 ? 1 : 0));
                int i5 = dsfVar.a;
                if (i5 == -1 || (i = dsfVar2.a) == -1) {
                    return g(removeSpaceGesture, mmeVar);
                }
                int i6 = (int) (J >> 32);
                mmeVar.invoke(new y69(new vg5[]{new p9h(i6 + i5, i6 + i), new t43(g.substring(i5, g.length() - (pej.e(J) - dsfVar2.a)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long M2 = m6k.M(q5bVar, wba.P(selectRangeGesture.getSelectionStartArea()), wba.P(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (pej.d(M2)) {
                return g(selectRangeGesture, mmeVar);
            }
            mmeVar.invoke(new p9h((int) (M2 >> 32), (int) (M2 & 4294967295L)));
            if (tbjVar != null) {
                tbjVar.e(true);
            }
        }
        return 1;
    }

    public static int z(jwj jwjVar, HandwritingGesture handwritingGesture, cej cejVar, Function0 function0, hsk hskVar) {
        int i;
        aej c;
        int i2;
        int i3 = 1;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long L = m6k.L(cejVar, wba.P(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (pej.d(L)) {
                return f(jwjVar, selectGesture);
            }
            jwjVar.j(L);
            if (function0 != null) {
                function0.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                i2 = deleteGesture.getGranularity() == 1 ? 1 : 0;
                long L2 = m6k.L(cejVar, wba.P(deleteGesture.getDeletionArea()), i2);
                if (pej.d(L2)) {
                    return f(jwjVar, deleteGesture);
                }
                if (i2 == 1) {
                    L2 = m6k.q(L2, jwjVar.d());
                }
                jwj.i(jwjVar, "", L2, false, 12);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    i2 = deleteRangeGesture.getGranularity() == 1 ? 1 : 0;
                    long N = m6k.N(cejVar, wba.P(deleteRangeGesture.getDeletionStartArea()), wba.P(deleteRangeGesture.getDeletionEndArea()), i2);
                    if (pej.d(N)) {
                        return f(jwjVar, deleteRangeGesture);
                    }
                    if (i2 == 1) {
                        N = m6k.q(N, jwjVar.d());
                    }
                    jwj.i(jwjVar, "", N, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (jwjVar.a.c() != jwjVar.a.c()) {
                        return 3;
                    }
                    long e0 = m6k.e0(joinOrSplitGesture.getJoinOrSplitPoint());
                    aej c2 = cejVar.c();
                    int I = c2 != null ? m6k.I(c2.b, e0, cejVar.e(), hskVar) : -1;
                    if (I == -1 || ((c = cejVar.c()) != null && m6k.R(c, I))) {
                        return f(jwjVar, joinOrSplitGesture);
                    }
                    long a0 = m6k.a0(jwjVar.d(), I);
                    if (pej.d(a0)) {
                        jwj.i(jwjVar, " ", a0, false, 12);
                        return 1;
                    }
                    jwj.i(jwjVar, "", a0, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    long e02 = m6k.e0(insertGesture.getInsertionPoint());
                    aej c3 = cejVar.c();
                    int I2 = c3 != null ? m6k.I(c3.b, e02, cejVar.e(), hskVar) : -1;
                    if (I2 == -1) {
                        return f(jwjVar, insertGesture);
                    }
                    jwj.i(jwjVar, insertGesture.getTextToInsert(), t6a.g(I2, I2), false, 12);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                long J = m6k.J(cejVar.c(), m6k.e0(removeSpaceGesture.getStartPoint()), m6k.e0(removeSpaceGesture.getEndPoint()), cejVar.e(), hskVar);
                if (pej.d(J)) {
                    return f(jwjVar, removeSpaceGesture);
                }
                dsf dsfVar = new dsf();
                dsfVar.a = -1;
                dsf dsfVar2 = new dsf();
                dsfVar2.a = -1;
                String g = new Regex("\\s+").g(t6a.K(J, jwjVar.d()), new x69(dsfVar, dsfVar2, i3));
                int i4 = dsfVar.a;
                if (i4 == -1 || (i = dsfVar2.a) == -1) {
                    return f(jwjVar, removeSpaceGesture);
                }
                int i5 = (int) (J >> 32);
                jwj.i(jwjVar, g.substring(dsfVar.a, g.length() - (pej.e(J) - dsfVar2.a)), t6a.g(i4 + i5, i5 + i), false, 12);
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long N2 = m6k.N(cejVar, wba.P(selectRangeGesture.getSelectionStartArea()), wba.P(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (pej.d(N2)) {
                return f(jwjVar, selectRangeGesture);
            }
            jwjVar.j(N2);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return 1;
    }
}
