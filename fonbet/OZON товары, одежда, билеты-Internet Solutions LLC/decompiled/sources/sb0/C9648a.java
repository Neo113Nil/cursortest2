package sb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.captcha.AntibotCaptchaChallengeManager", f = "AntibotCaptchaChallengeManager.kt", l = {62}, m = "openWebView")
/* renamed from: sb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9648a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9649b f98504d;

    /* renamed from: e, reason: collision with root package name */
    String f98505e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f98506f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9649b f98507g;

    /* renamed from: h, reason: collision with root package name */
    int f98508h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9648a(C9649b c9649b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f98507g = c9649b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j11;
        this.f98506f = obj;
        this.f98508h |= LinearLayoutManager.INVALID_OFFSET;
        j11 = this.f98507g.j(null, this);
        return j11;
    }
}
