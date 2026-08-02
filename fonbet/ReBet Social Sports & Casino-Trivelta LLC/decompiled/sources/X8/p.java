package X8;

import U8.c;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.network.response.MediaResponse;
import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class p extends GPHVideoPlayerView {

    /* renamed from: r, reason: collision with root package name */
    public boolean f13658r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13659s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13660t;

    /* renamed from: u, reason: collision with root package name */
    public final Function1 f13661u;

    public /* synthetic */ p(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final Unit t(p pVar, U8.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (pVar.s()) {
            int surfaceId = UIManagerHelper.getSurfaceId(pVar);
            if (it instanceof c.g) {
                pVar.v();
                pVar.r(new Z8.d(surfaceId, pVar.getId(), Z8.e.f14741c));
            } else if (it instanceof c.f) {
                pVar.r(new Z8.d(surfaceId, pVar.getId(), Z8.e.f14742d));
            }
            U8.b videoPlayer = pVar.getVideoPlayer();
            if (videoPlayer != null && videoPlayer.f()) {
                pVar.r(new Z8.d(surfaceId, pVar.getId(), Z8.e.f14743e));
            }
        } else {
            pVar.f13660t = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit u(p pVar, MediaResponse mediaResponse, Throwable th2) {
        Media data;
        if (mediaResponse == null || (data = mediaResponse.getData()) == null) {
            return Unit.INSTANCE;
        }
        pVar.o(data);
        U8.b.m(u.f13662a.e(), data, pVar.f13658r, pVar, null, 8, null);
        if (th2 != null) {
            timber.log.a.a("Error while fetching GIF: %s", th2.getLocalizedMessage());
        }
        return Unit.INSTANCE;
    }

    @Override // com.giphy.sdk.ui.views.GPHVideoPlayerView
    public void k() {
        super.k();
        this.f13659s = false;
    }

    public final void r(Event event) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ThemedReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    public final boolean s() {
        U8.b videoPlayer = getVideoPlayer();
        return Intrinsics.areEqual(videoPlayer != null ? videoPlayer.g() : null, this);
    }

    public final void setAutoPlay(@Nullable Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.valueOf(this.f13658r))) {
            return;
        }
        this.f13658r = bool != null ? bool.booleanValue() : false;
    }

    public final void setMedia(@Nullable String str) {
        if (str == null) {
            return;
        }
        J8.a.f5957a.a(str, new Function2() { // from class: X8.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit u10;
                u10 = p.u(p.this, (MediaResponse) obj, (Throwable) obj2);
                return u10;
            }
        });
    }

    public final void setMuted(@Nullable Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.valueOf(this.f13659s))) {
            return;
        }
        this.f13659s = bool != null ? bool.booleanValue() : false;
        w();
    }

    public final void v() {
        if (this.f13660t) {
            return;
        }
        w();
        this.f13660t = true;
    }

    public final void w() {
        U8.b videoPlayer;
        U8.b videoPlayer2;
        if (s()) {
            if (this.f13659s) {
                U8.b videoPlayer3 = getVideoPlayer();
                if (Intrinsics.areEqual(videoPlayer3 != null ? Float.valueOf(videoPlayer3.j()) : null, 0.0f) || (videoPlayer2 = getVideoPlayer()) == null) {
                    return;
                }
                videoPlayer2.u(0.0f);
                return;
            }
            U8.b videoPlayer4 = getVideoPlayer();
            if (Intrinsics.areEqual(videoPlayer4 != null ? Float.valueOf(videoPlayer4.j()) : null, 1.0f) || (videoPlayer = getVideoPlayer()) == null) {
                return;
            }
            videoPlayer.u(1.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setVideoPlayer(u.f13662a.e());
        this.f13661u = new Function1() { // from class: X8.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t10;
                t10 = p.t(p.this, (U8.c) obj);
                return t10;
            }
        };
    }
}
