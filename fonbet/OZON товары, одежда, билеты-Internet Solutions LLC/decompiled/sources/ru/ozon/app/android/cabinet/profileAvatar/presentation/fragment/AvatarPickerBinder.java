package ru.ozon.app.android.cabinet.profileAvatar.presentation.fragment;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.view.AvatarPickerView;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/fragment/AvatarPickerBinder;", "", "view", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/view/AvatarPickerView;", "router", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/fragment/AvatarPickerRouter;", "<init>", "(Lru/ozon/app/android/cabinet/profileAvatar/presentation/view/AvatarPickerView;Lru/ozon/app/android/cabinet/profileAvatar/presentation/fragment/AvatarPickerRouter;)V", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvatarPickerBinder {

    @NotNull
    private final AvatarPickerRouter router;

    @NotNull
    private final AvatarPickerView view;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cabinet.profileAvatar.presentation.fragment.AvatarPickerBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AvatarPickerBinder.this.router.openChoosePhotoPicker();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cabinet.profileAvatar.presentation.fragment.AvatarPickerBinder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<Integer, Uri, Unit> {
        AnonymousClass2(Object obj) {
            super(2, obj, AvatarPickerRouter.class, "sendResult", "sendResult(ILandroid/net/Uri;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Uri uri) {
            invoke(num.intValue(), uri);
            return Unit.f71690a;
        }

        public final void invoke(int i11, Uri uri) {
            ((AvatarPickerRouter) this.receiver).sendResult(i11, uri);
        }
    }

    public AvatarPickerBinder(@NotNull AvatarPickerView view, @NotNull AvatarPickerRouter router) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(router, "router");
        this.view = view;
        this.router = router;
        view.setOpenChoosePhotoPicker(new AnonymousClass1());
        view.setSendResult(new AnonymousClass2(router));
    }
}
