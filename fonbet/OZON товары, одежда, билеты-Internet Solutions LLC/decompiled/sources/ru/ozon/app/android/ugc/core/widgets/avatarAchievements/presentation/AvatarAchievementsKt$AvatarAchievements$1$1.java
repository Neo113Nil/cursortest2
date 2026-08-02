package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AvatarAchievements$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ List<t> $tokenizedEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AvatarAchievementsKt$AvatarAchievements$1$1(List<t> list, Function1<? super t, Unit> function1) {
        super(0);
        this.$tokenizedEvents = list;
        this.$onView = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List<t> list = this.$tokenizedEvents;
        Function1<t, Unit> function1 = this.$onView;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            function1.invoke(list.get(i11));
        }
    }
}
