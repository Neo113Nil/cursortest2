package defpackage;

import android.widget.ImageView;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.players.ui.StatusIndicatorView;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStatusIndicatorStateStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStatusIndicatorStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.blaze.blazesdk.style.players.videos.c;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wzm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0n b;
    public final /* synthetic */ BlazeVideosPlayerStyle c;
    public final /* synthetic */ n4m d;

    public /* synthetic */ wzm(e0n e0nVar, n4m n4mVar, BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
        this.a = 8;
        this.b = e0nVar;
        this.d = n4mVar;
        this.c = blazeVideosPlayerStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BlazeVideosPlayerStatusIndicatorStateStyle blazeVideosPlayerStatusIndicatorStateStyle;
        VideoModel videoModel;
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        e0n e0nVar = this.b;
        n4m n4mVar = this.d;
        BlazeVideosPlayerStyle blazeVideosPlayerStyle = this.c;
        switch (i) {
            case 0:
                uxm uxmVar = (uxm) obj;
                boolean z = e0n.n;
                uxmVar.getClass();
                ImageView imageView = uxmVar.G;
                imageView.getClass();
                ctl.setPlayerButtonUi$default(imageView, blazeVideosPlayerStyle.getButtons().getPrevious(), false, n4mVar.b, mol.HIDE, 2, null);
                imageView.setOnClickListener(new b0n(e0nVar, i3));
                break;
            case 1:
                uxm uxmVar2 = (uxm) obj;
                boolean z2 = e0n.n;
                uxmVar2.getClass();
                boolean z3 = e0nVar.f;
                ImageView imageView2 = uxmVar2.x;
                if (!z3) {
                    imageView2.getClass();
                    imageView2.setVisibility(8);
                    break;
                } else {
                    imageView2.getClass();
                    ctl.setPlayerButtonUi$default(imageView2, blazeVideosPlayerStyle.getButtons().getSeekBackward(), false, n4mVar.b, mol.GONE, 2, null);
                    imageView2.setOnClickListener(new b0n(e0nVar, i2));
                    break;
                }
            case 2:
                uxm uxmVar3 = (uxm) obj;
                boolean z4 = e0n.n;
                uxmVar3.getClass();
                ImageView imageView3 = uxmVar3.D;
                imageView3.getClass();
                ctl.setPlayerButtonUi$default(imageView3, blazeVideosPlayerStyle.getButtons().getSettings$blazesdk_release(), false, n4mVar.b, null, 10, null);
                imageView3.setOnClickListener(new b0n(e0nVar, 5));
                break;
            case 3:
                uxm uxmVar4 = e0nVar.b;
                boolean z5 = e0n.n;
                ((uxm) obj).getClass();
                boolean z6 = fgm.f(n4mVar) != null && z7m.b(BlazePlayerType.VIDEOS);
                ImageView imageView4 = uxmVar4.E;
                imageView4.getClass();
                ctl.setPlayerButtonUi$default(imageView4, blazeVideosPlayerStyle.getButtons().getShare(), z6, n4mVar.b, null, 8, null);
                if (z6) {
                    uxmVar4.E.setOnClickListener(new b0n(e0nVar, 12));
                }
                break;
            case 4:
                uxm uxmVar5 = (uxm) obj;
                boolean z7 = e0n.n;
                uxmVar5.getClass();
                ImageView imageView5 = uxmVar5.l;
                imageView5.getClass();
                ctl.c(imageView5, blazeVideosPlayerStyle.getButtons().getReplay(), false, n4mVar.b, mol.HIDE);
                imageView5.setOnClickListener(new b0n(e0nVar, 7));
                break;
            case 5:
                uxm uxmVar6 = (uxm) obj;
                boolean z8 = e0n.n;
                uxmVar6.getClass();
                boolean z9 = e0nVar.f;
                ImageView imageView6 = uxmVar6.A;
                if (!z9) {
                    imageView6.getClass();
                    imageView6.setVisibility(8);
                    break;
                } else {
                    imageView6.getClass();
                    ctl.setPlayerButtonUi$default(imageView6, blazeVideosPlayerStyle.getButtons().getSeekForward(), false, n4mVar.b, mol.GONE, 2, null);
                    imageView6.setOnClickListener(new b0n(e0nVar, 10));
                    break;
                }
            case 6:
                uxm uxmVar7 = (uxm) obj;
                boolean z10 = e0n.n;
                uxmVar7.getClass();
                ImageView imageView7 = uxmVar7.H;
                imageView7.getClass();
                ctl.setPlayerButtonUi$default(imageView7, blazeVideosPlayerStyle.getButtons().getMute(), false, n4mVar.b, null, 10, null);
                e0nVar.o();
                imageView7.setOnClickListener(new b0n(e0nVar, 9));
                break;
            case 7:
                uxm uxmVar8 = (uxm) obj;
                boolean z11 = e0n.n;
                uxmVar8.getClass();
                ImageView imageView8 = uxmVar8.H;
                imageView8.getClass();
                ctl.setPlayerButtonUi$default(imageView8, blazeVideosPlayerStyle.getButtons().getMute(), false, n4mVar.b, null, 10, null);
                e0nVar.o();
                imageView8.setOnClickListener(new b0n(e0nVar, 11));
                break;
            case 8:
                boolean z12 = e0n.n;
                ((uxm) obj).getClass();
                BlazeVideosPlayerButtonStyle captions = blazeVideosPlayerStyle.getButtons().getCaptions();
                ImageView imageView9 = e0nVar.b.k;
                imageView9.getClass();
                ctl.setPlayerButtonUi$default(imageView9, captions, false, n4mVar.b, mol.GONE, 2, null);
                eqm d = fgm.d(n4mVar);
                if (d != null) {
                    imageView9.setAlpha(d.d() ? 1.0f : 0.5f);
                    e0nVar.n();
                    evl.setDebouncedOnClickListener$default(imageView9, 0L, null, new bcl(25, d, e0nVar), 3, null);
                }
                break;
            case 9:
                uxm uxmVar9 = (uxm) obj;
                boolean z13 = e0n.n;
                uxmVar9.getClass();
                StatusIndicatorView statusIndicatorView = uxmVar9.I;
                BlazeVideosPlayerStatusIndicatorStyle statusIndicator$blazesdk_release = blazeVideosPlayerStyle.getStatusIndicator$blazesdk_release();
                n4mVar.getClass();
                gim gimVar = n4mVar.b;
                gim.e eVar = gimVar instanceof gim.e ? (gim.e) gimVar : null;
                BlazeLiveStreamStatus blazeLiveStreamStatus = (eVar == null || (videoModel = eVar.a) == null) ? null : videoModel.s;
                int i4 = blazeLiveStreamStatus == null ? -1 : t0n.b[blazeLiveStreamStatus.ordinal()];
                if (i4 == -1) {
                    blazeVideosPlayerStatusIndicatorStateStyle = null;
                } else if (i4 == 1) {
                    blazeVideosPlayerStatusIndicatorStateStyle = statusIndicator$blazesdk_release.getStreamStates().getLiveStreamState();
                } else if (i4 == 2) {
                    blazeVideosPlayerStatusIndicatorStateStyle = statusIndicator$blazesdk_release.getStreamStates().getUpcomingStreamState();
                } else if (i4 != 3) {
                    zzl.b();
                    break;
                } else {
                    blazeVideosPlayerStatusIndicatorStateStyle = statusIndicator$blazesdk_release.getStreamStates().getEndedStreamState();
                }
                e0nVar.k = statusIndicator$blazesdk_release.isVisible() && blazeVideosPlayerStatusIndicatorStateStyle != null && blazeVideosPlayerStatusIndicatorStateStyle.isVisible();
                statusIndicatorView.getClass();
                if (e0nVar.k) {
                    statusIndicatorView.setVisibility(0);
                } else {
                    statusIndicatorView.setVisibility(8);
                }
                if (e0nVar.k && blazeVideosPlayerStatusIndicatorStateStyle != null) {
                    BlazeInsets padding = statusIndicator$blazesdk_release.getPadding();
                    padding.getClass();
                    boolean isVisible = blazeVideosPlayerStatusIndicatorStateStyle.isVisible();
                    String text = blazeVideosPlayerStatusIndicatorStateStyle.getText();
                    int textColor = blazeVideosPlayerStatusIndicatorStateStyle.getTextStyle().getTextColor();
                    float textSize = blazeVideosPlayerStatusIndicatorStateStyle.getTextStyle().getTextSize();
                    Integer fontResId = blazeVideosPlayerStatusIndicatorStateStyle.getTextStyle().getFontResId();
                    int backgroundColor = blazeVideosPlayerStatusIndicatorStateStyle.getBackgroundColor();
                    Integer backgroundImageResId = blazeVideosPlayerStatusIndicatorStateStyle.getBackgroundImageResId();
                    BlazeDp cornerRadius = blazeVideosPlayerStatusIndicatorStateStyle.getCornerRadius();
                    Float cornerRadiusRatio = blazeVideosPlayerStatusIndicatorStateStyle.getCornerRadiusRatio();
                    int borderColor = blazeVideosPlayerStatusIndicatorStateStyle.getBorderColor();
                    int toPx$blazesdk_release = blazeVideosPlayerStatusIndicatorStateStyle.getBorderWidth().getToPx$blazesdk_release();
                    c icon$blazesdk_release = blazeVideosPlayerStatusIndicatorStateStyle.getIcon$blazesdk_release();
                    statusIndicatorView.setupView(new StatusIndicatorView.b(isVisible, text, textColor, textSize, fontResId, backgroundColor, backgroundImageResId, cornerRadius, cornerRadiusRatio, borderColor, toPx$blazesdk_release, icon$blazesdk_release != null ? new StatusIndicatorView.b.a(icon$blazesdk_release.a, icon$blazesdk_release.b) : null, padding, null));
                }
                e0nVar.l(e0nVar.k);
                break;
            default:
                uxm uxmVar10 = (uxm) obj;
                boolean z14 = e0n.n;
                uxmVar10.getClass();
                ImageView imageView10 = uxmVar10.F;
                imageView10.getClass();
                ctl.setPlayerButtonUi$default(imageView10, blazeVideosPlayerStyle.getButtons().getNext(), false, n4mVar.b, mol.HIDE, 2, null);
                imageView10.setOnClickListener(new b0n(e0nVar, 4));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wzm(n4m n4mVar, e0n e0nVar, BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
        this.a = 3;
        this.d = n4mVar;
        this.b = e0nVar;
        this.c = blazeVideosPlayerStyle;
    }

    public /* synthetic */ wzm(e0n e0nVar, BlazeVideosPlayerStyle blazeVideosPlayerStyle, n4m n4mVar, int i) {
        this.a = i;
        this.b = e0nVar;
        this.c = blazeVideosPlayerStyle;
        this.d = n4mVar;
    }

    public /* synthetic */ wzm(BlazeVideosPlayerStyle blazeVideosPlayerStyle, n4m n4mVar, e0n e0nVar, int i) {
        this.a = i;
        this.c = blazeVideosPlayerStyle;
        this.d = n4mVar;
        this.b = e0nVar;
    }
}
