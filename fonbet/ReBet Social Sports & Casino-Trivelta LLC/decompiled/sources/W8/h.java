package W8;

import V8.C1741w;
import V8.f0;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.ui.GPHContentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public abstract class h {

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, j.class, "queryUsername", "queryUsername(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Ljava/lang/String;)V", 1);
        }

        public final void a(String str) {
            j.d((W8.a) this.receiver, str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, W8.b.class, "onRemoveRecentGif", "onRemoveRecentGif(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Ljava/lang/String;)V", 1);
        }

        public final void a(String str) {
            W8.b.d((W8.a) this.receiver, str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ W8.a f13132d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Media f13133e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(W8.a aVar, Media media) {
            super(1);
            this.f13132d = aVar;
            this.f13133e = media;
        }

        public final void a(Media it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f13132d.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifTrackingManager$giphy_ui_2_3_17_release().h(this.f13133e, ActionType.CLICK);
            this.f13132d.a(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }
    }

    public static final void a(W8.a aVar, Media media, int i10) {
        View view;
        C1741w mediaPreview$giphy_ui_2_3_17_release;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(media, "media");
        aVar.setMediaPreview$giphy_ui_2_3_17_release(new C1741w(aVar.getContext(), media, aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.recents, false, 8, null));
        C1741w mediaPreview$giphy_ui_2_3_17_release2 = aVar.getMediaPreview$giphy_ui_2_3_17_release();
        if (mediaPreview$giphy_ui_2_3_17_release2 != null) {
            mediaPreview$giphy_ui_2_3_17_release2.setFocusable(true);
        }
        C1741w mediaPreview$giphy_ui_2_3_17_release3 = aVar.getMediaPreview$giphy_ui_2_3_17_release();
        if (mediaPreview$giphy_ui_2_3_17_release3 != null) {
            mediaPreview$giphy_ui_2_3_17_release3.u(new a(aVar));
        }
        C1741w mediaPreview$giphy_ui_2_3_17_release4 = aVar.getMediaPreview$giphy_ui_2_3_17_release();
        if (mediaPreview$giphy_ui_2_3_17_release4 != null) {
            mediaPreview$giphy_ui_2_3_17_release4.s(new b(aVar));
        }
        C1741w mediaPreview$giphy_ui_2_3_17_release5 = aVar.getMediaPreview$giphy_ui_2_3_17_release();
        if (mediaPreview$giphy_ui_2_3_17_release5 != null) {
            mediaPreview$giphy_ui_2_3_17_release5.t(new c(aVar, media));
        }
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifTrackingManager$giphy_ui_2_3_17_release().h(media, ActionType.LONGPRESS);
        RecyclerView.F e02 = aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().e0(i10);
        if (e02 == null || (view = e02.itemView) == null || (mediaPreview$giphy_ui_2_3_17_release = aVar.getMediaPreview$giphy_ui_2_3_17_release()) == null) {
            return;
        }
        mediaPreview$giphy_ui_2_3_17_release.showAsDropDown(view);
    }

    public static final void b(W8.a aVar, User user) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        Context context = aVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        aVar.setUserProfileInfoDialog$giphy_ui_2_3_17_release(new f0(context, user));
        f0 userProfileInfoDialog$giphy_ui_2_3_17_release = aVar.getUserProfileInfoDialog$giphy_ui_2_3_17_release();
        if (userProfileInfoDialog$giphy_ui_2_3_17_release != null) {
            userProfileInfoDialog$giphy_ui_2_3_17_release.showAsDropDown(aVar.getGifsRecyclerView$giphy_ui_2_3_17_release());
        }
    }
}
