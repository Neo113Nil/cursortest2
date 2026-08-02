package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.C3689q;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.results.R;
import com.sofascore.results.event.lineups.view.RugbyLineupsFieldView;
import com.sofascore.results.profile.editor.dialog.ProfileEditorMatchOpeningsDescriptionModal;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardsActivity;
import com.sofascore.results.profile.view.WeeklyStreaksExplanationModal;
import com.sofascore.results.view.graph.SeasonRatingGraph;
import com.sofascore.results.view.header.TeamLogoView;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.UnityAdsModule;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class k9f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ k9f(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        File glInfoDataStore$lambda$2;
        File webViewConfigurationDataStore$lambda$3;
        int i2 = this.a;
        int i3 = 3;
        rq3 rq3Var = null;
        Context context = this.b;
        switch (i2) {
            case 0:
                context.getClass();
                ProfileEditorMatchOpeningsDescriptionModal profileEditorMatchOpeningsDescriptionModal = new ProfileEditorMatchOpeningsDescriptionModal();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(profileEditorMatchOpeningsDescriptionModal, appCompatActivity, rq3Var, i3));
                }
                return Unit.a;
            case 1:
                nv.e0(context, hta.TOP_EDITORS, "editor");
                int i4 = ProfileTopLeaderboardsActivity.N;
                yfa.I(context, baf.c);
                return Unit.a;
            case 2:
                return Integer.valueOf(context.getColor(R.color.surface_2));
            case 3:
                int i5 = RugbyLineupsFieldView.g;
                return Integer.valueOf(ao2.s(68, context));
            case 4:
                int i6 = RugbyLineupsFieldView.g;
                return Integer.valueOf(ao2.s(72, context));
            case 5:
                RelativeLayout relativeLayout = new RelativeLayout(context);
                TextView textView = new TextView(context);
                textView.setText("The ad was closed by Equativ.");
                textView.setTextSize(2, 12.0f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(14);
                layoutParams.addRule(15);
                relativeLayout.addView(textView, layoutParams);
                return relativeLayout;
            case 6:
                int i7 = SeasonRatingGraph.B;
                Drawable drawable = context.getDrawable(R.drawable.ic_transfer_in);
                if (drawable == null) {
                    return null;
                }
                drawable.setBounds((-drawable.getIntrinsicWidth()) / 2, 0, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight());
                drawable.setTint(context.getColor(R.color.primary_default));
                return drawable;
            case 7:
                int i8 = SeasonRatingGraph.B;
                Paint paint = new Paint();
                paint.setColor(context.getColor(R.color.primary_default));
                paint.setStrokeWidth(ao2.u(2, context));
                return paint;
            case 8:
                int i9 = SeasonRatingGraph.B;
                Drawable drawable2 = context.getDrawable(R.drawable.ic_cross);
                if (drawable2 == null) {
                    return null;
                }
                drawable2.setBounds((-drawable2.getIntrinsicWidth()) / 2, 0, drawable2.getIntrinsicWidth() / 2, drawable2.getIntrinsicHeight());
                drawable2.setTint(context.getColor(R.color.error));
                return drawable2;
            case 9:
                int i10 = SeasonRatingGraph.B;
                Paint paint2 = new Paint();
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(context.getColor(R.color.error));
                paint2.setAlpha(38);
                return paint2;
            case 10:
                int i11 = SeasonRatingGraph.B;
                Paint paint3 = new Paint(1);
                float s = ao2.s(4, context);
                paint3.setPathEffect(new DashPathEffect(new float[]{s, s}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                paint3.setStrokeWidth(ao2.s(1, context));
                paint3.setStyle(Paint.Style.STROKE);
                return paint3;
            case 11:
                spf spfVar = new spf(0);
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    i = (context.getApplicationInfo().flags & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    i = NotificationCompat.FLAG_LOCAL_ONLY;
                }
                return new fpf(new ou4((long) (0.1d * i * 1048576), spfVar), spfVar);
            case 12:
                int i12 = TeamLogoView.t;
                return new m0j(context);
            case 13:
                context.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                ia0 ia0Var = ia0.q;
                me4.d((f5d) me4.e(), "editor_banner_click", firebaseBundle, context).a.e(n9e.K(firebaseBundle), null, "editor_banner_click", false);
                bea.G(context, "https://play.google.com/store/apps/details?id=com.sofascore.editor");
                return Unit.a;
            case 14:
                glInfoDataStore$lambda$2 = UnityAdsModule.glInfoDataStore$lambda$2(context);
                return glInfoDataStore$lambda$2;
            case 15:
                webViewConfigurationDataStore$lambda$3 = UnityAdsModule.webViewConfigurationDataStore$lambda$3(context);
                return webViewConfigurationDataStore$lambda$3;
            case 16:
                WeeklyStreaksExplanationModal weeklyStreaksExplanationModal = new WeeklyStreaksExplanationModal();
                context.getClass();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity2 != null) {
                    wca.x(appCompatActivity2.getLifecycle()).b(new r1(weeklyStreaksExplanationModal, appCompatActivity2, rq3Var, i3));
                }
                return Unit.a;
            case 17:
                return new htg(context);
            default:
                return C3689q.a(context);
        }
    }
}
