package defpackage;

import android.content.Context;
import com.sofascore.results.view.follownotification.FollowButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class df8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ df8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                FollowButton followButton = new FollowButton(context, null, 6);
                FollowButton.f(followButton, obj2, wu.MAIN_FEED, 4);
                return followButton;
            default:
                FollowButton followButton2 = (FollowButton) obj;
                followButton2.getClass();
                FollowButton.f(followButton2, obj2, wu.MAIN_FEED, 4);
                return Unit.a;
        }
    }
}
