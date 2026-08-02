package defpackage;

import android.widget.FrameLayout;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.features.moments.container.compose.BlazeMomentsPlayerContainerComposeStateHandler;
import com.blaze.blazesdk.features.moments.inline.BlazeMomentsInlinePlayer;
import com.blaze.blazesdk.features.videos.inline.BlazeVideosInlinePlayer;
import com.blaze.blazesdk.features.videos.inline.compose.BlazeVideosInlinePlayerComposeStateHandler;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.BlazeScreens;
import com.blaze.blazesdk.shared.results.BlazeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class sx1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sx1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit updatePlaceholderImage$lambda$6;
        Unit prepareMoments$lambda$2;
        Unit prepareMoments$lambda$1;
        Unit playStories$lambda$4;
        Unit handleNotificationValue$lambda$20;
        Unit playVideos$lambda$11;
        Unit externalUserId$lambda$18;
        Unit init$lambda$1;
        Unit playMoment$lambda$9;
        Unit prepareVideos$lambda$10;
        Unit handleUniversalLink$lambda$6;
        Unit handlePushNotificationPayload$lambda$21;
        Unit prepareMoments$lambda$7;
        Unit playVideo$lambda$12;
        Unit updateGeoRestriction$lambda$19;
        Unit playMoments$lambda$8;
        Unit prepareStories$lambda$3;
        Unit appendMomentsToPlayer$lambda$22;
        Unit playStory$lambda$5;
        Unit showSearchScreen$lambda$0;
        Unit updatePlaceholderImage$lambda$5;
        Unit prepareVideos$lambda$1;
        switch (this.a) {
            case 0:
                updatePlaceholderImage$lambda$6 = BlazeMomentsInlinePlayer.updatePlaceholderImage$lambda$6((gq5) obj);
                break;
            case 1:
                prepareMoments$lambda$2 = BlazeMomentsPlayerContainer.Companion.prepareMoments$lambda$2((BlazeResult) obj);
                break;
            case 2:
                ((BlazeResult) obj).getClass();
                break;
            case 3:
                ((FrameLayout) obj).getClass();
                break;
            case 4:
                prepareMoments$lambda$1 = BlazeMomentsPlayerContainerComposeStateHandler.prepareMoments$lambda$1((BlazeResult) obj);
                break;
            case 5:
                ((FrameLayout) obj).getClass();
                break;
            case 6:
                playStories$lambda$4 = BlazeSDK.playStories$lambda$4((BlazeResult) obj);
                break;
            case 7:
                handleNotificationValue$lambda$20 = BlazeSDK.handleNotificationValue$lambda$20((BlazeResult) obj);
                break;
            case 8:
                playVideos$lambda$11 = BlazeSDK.playVideos$lambda$11((BlazeResult) obj);
                break;
            case 9:
                externalUserId$lambda$18 = BlazeSDK.setExternalUserId$lambda$18((BlazeResult) obj);
                break;
            case 10:
                init$lambda$1 = BlazeSDK.init$lambda$1((BlazeResult.Error) obj);
                break;
            case 11:
                playMoment$lambda$9 = BlazeSDK.playMoment$lambda$9((BlazeResult) obj);
                break;
            case 12:
                prepareVideos$lambda$10 = BlazeSDK.prepareVideos$lambda$10((BlazeResult) obj);
                break;
            case 13:
                handleUniversalLink$lambda$6 = BlazeSDK.handleUniversalLink$lambda$6((BlazeResult) obj);
                break;
            case 14:
                handlePushNotificationPayload$lambda$21 = BlazeSDK.handlePushNotificationPayload$lambda$21((BlazeResult) obj);
                break;
            case 15:
                prepareMoments$lambda$7 = BlazeSDK.prepareMoments$lambda$7((BlazeResult) obj);
                break;
            case 16:
                playVideo$lambda$12 = BlazeSDK.playVideo$lambda$12((BlazeResult) obj);
                break;
            case 17:
                updateGeoRestriction$lambda$19 = BlazeSDK.updateGeoRestriction$lambda$19((BlazeResult) obj);
                break;
            case 18:
                playMoments$lambda$8 = BlazeSDK.playMoments$lambda$8((BlazeResult) obj);
                break;
            case 19:
                prepareStories$lambda$3 = BlazeSDK.prepareStories$lambda$3((BlazeResult) obj);
                break;
            case 20:
                appendMomentsToPlayer$lambda$22 = BlazeSDK.appendMomentsToPlayer$lambda$22((BlazeResult) obj);
                break;
            case 21:
                playStory$lambda$5 = BlazeSDK.playStory$lambda$5((BlazeResult) obj);
                break;
            case 22:
                showSearchScreen$lambda$0 = BlazeScreens.showSearchScreen$lambda$0((BlazeResult) obj);
                break;
            case 23:
                updatePlaceholderImage$lambda$5 = BlazeVideosInlinePlayer.updatePlaceholderImage$lambda$5((gq5) obj);
                break;
            case 24:
                ((FrameLayout) obj).getClass();
                break;
            case 25:
                prepareVideos$lambda$1 = BlazeVideosInlinePlayerComposeStateHandler.prepareVideos$lambda$1((BlazeResult) obj);
                break;
            case 26:
                rx2 rx2Var = (rx2) obj;
                rx2Var.getClass();
                rq3 rq3Var = null;
                rx2Var.a(uic.d, new zy1(3, rq3Var, 0));
                rx2Var.a(inb.f, new d11(2, rq3Var, 4));
                break;
            case 27:
                ((yma) obj).a();
                break;
            case 28:
                break;
            default:
                break;
        }
        return Unit.a;
    }
}
