package ru.ozon.app.android.session.userSocialsMobile.presentation.item;

import Pc.a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileDTO;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileItemMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001a\u0010 \u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R,\u0010(\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileItemMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModelImpl;", "pViewModel", "<init>", "(Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileItemMapper;LPc/a;)V", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileItemMapper;", "getMapper", "()Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileItemMapper;", "LPc/a;", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UserSocialsMobileItemViewMapper extends WidgetViewMapper<UserSocialsMobileDTO, UserSocialsMobileItemVO> {

    @NotNull
    private final Function2<View, ComposerReferences, UserSocialsMobileItemViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final UserSocialsMobileItemMapper mapper;

    @NotNull
    private final a<UserSocialsMobileItemViewModelImpl> pViewModel;

    public UserSocialsMobileItemViewMapper(@NotNull UserSocialsMobileItemMapper mapper, @NotNull a<UserSocialsMobileItemViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.mapper = mapper;
        this.pViewModel = pViewModel;
        this.layout = R$layout.widget_user_socials_mobile_item;
        this.holderProducer = new UserSocialsMobileItemViewMapper$holderProducer$1(this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSocialsMobileItemViewMapper)) {
            return false;
        }
        UserSocialsMobileItemViewMapper userSocialsMobileItemViewMapper = (UserSocialsMobileItemViewMapper) other;
        return Intrinsics.d(this.mapper, userSocialsMobileItemViewMapper.mapper) && Intrinsics.d(this.pViewModel, userSocialsMobileItemViewMapper.pViewModel);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new UserSocialsMobileItemDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<UserSocialsMobileItemVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    public int hashCode() {
        return this.pViewModel.hashCode() + (this.mapper.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UserSocialsMobileItemViewMapper(mapper=" + this.mapper + ", pViewModel=" + this.pViewModel + ")";
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<UserSocialsMobileDTO, d, List<UserSocialsMobileItemVO>> getMapper() {
        return this.mapper;
    }
}
