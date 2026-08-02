package ru.ozon.app.android.cabinet.profileAvatar.core;

import Xc.a;
import Xc.b;
import android.view.View;
import java.util.ArrayList;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.R$layout;
import ru.ozon.app.android.cabinet.profileAvatar.data.ProfileAvatarDTO;
import ru.ozon.app.android.cabinet.profileAvatar.di.ProfileAvatarComponent;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.ProfileAvatarViewHolder;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewItem.ProfileAvatarVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cabinet/profileAvatar/di/ProfileAvatarComponent;", "Lru/ozon/app/android/cabinet/profileAvatar/data/ProfileAvatarDTO;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;", "<init>", "()V", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewItem/ProfileAvatarVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/ProfileAvatarViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarMapper;", "getMapper", "()Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarMapper;", "mapper", "ProfileAvatarPayload", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileAvatarViewMapper extends WidgetViewMapper2<ProfileAvatarComponent, ProfileAvatarDTO, ProfileAvatarVO> {
    private final int layout = R$layout.widget_profile_avatar;

    @NotNull
    private final Function2<View, ComposerReferences, ProfileAvatarViewHolder> holderProducer = new ProfileAvatarViewMapper$holderProducer$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarViewMapper$ProfileAvatarPayload;", "", "<init>", "(Ljava/lang/String;I)V", "AVATAR", SelectionItemDescriptionDTO.TITLE, "BACKGROUND", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class ProfileAvatarPayload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ProfileAvatarPayload[] $VALUES;
        public static final ProfileAvatarPayload AVATAR = new ProfileAvatarPayload("AVATAR", 0);
        public static final ProfileAvatarPayload TITLE = new ProfileAvatarPayload(SelectionItemDescriptionDTO.TITLE, 1);
        public static final ProfileAvatarPayload BACKGROUND = new ProfileAvatarPayload("BACKGROUND", 2);

        private static final /* synthetic */ ProfileAvatarPayload[] $values() {
            return new ProfileAvatarPayload[]{AVATAR, TITLE, BACKGROUND};
        }

        static {
            ProfileAvatarPayload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ProfileAvatarPayload(String str, int i11) {
        }

        public static ProfileAvatarPayload valueOf(String str) {
            return (ProfileAvatarPayload) Enum.valueOf(ProfileAvatarPayload.class, str);
        }

        public static ProfileAvatarPayload[] values() {
            return (ProfileAvatarPayload[]) $VALUES.clone();
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ProfileAvatarViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ProfileAvatarComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ProfileAvatarComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ProfileAvatarMapper getMapper() {
        return component().getProfileAvatarMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull ProfileAvatarVO oldItem, @NotNull ProfileAvatarVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getAvatarIcon(), newItem.getAvatarIcon())) {
            arrayList.add(ProfileAvatarPayload.AVATAR);
        }
        if (!Intrinsics.d(oldItem.getActionTitle(), newItem.getActionTitle())) {
            arrayList.add(ProfileAvatarPayload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getBackgroundColor(), newItem.getBackgroundColor())) {
            arrayList.add(ProfileAvatarPayload.BACKGROUND);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
