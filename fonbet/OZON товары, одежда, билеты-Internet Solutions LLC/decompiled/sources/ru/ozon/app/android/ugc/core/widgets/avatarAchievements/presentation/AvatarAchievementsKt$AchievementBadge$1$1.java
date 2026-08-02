package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import Kk.C3532b;
import k1.C7456b;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.C8408a;
import n1.C8416i;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AchievementBadge$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ long $strokeColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarAchievementsKt$AchievementBadge$1$1(long j11) {
        super(1);
        this.$strokeColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        AvatarAchievementsDefaults avatarAchievementsDefaults = AvatarAchievementsDefaults.INSTANCE;
        float v12 = drawWithContent.v1(avatarAchievementsDefaults.m1458getBADGE_STROKE_WIDTHD9Ej5fM());
        float v13 = drawWithContent.v1(avatarAchievementsDefaults.m1457getBADGE_STROKE_RADIUSD9Ej5fM());
        float f7 = C7464j.f(drawWithContent.i());
        float d11 = C7464j.d(drawWithContent.i());
        C8408a.b w02 = drawWithContent.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            w02.f().b(0.0f, 0.0f, f7, d11, 1);
            drawWithContent.F0();
            C3532b.b(w02, e11);
            InterfaceC8412e.p0(drawWithContent, this.$strokeColor, 0L, 0L, C7456b.a(v13, v13), new C8416i(v12, 0.0f, 0, 0, null, 30), 230);
        } catch (Throwable th2) {
            C3532b.b(w02, e11);
            throw th2;
        }
    }
}
