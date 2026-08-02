package ru.ozon.app.android.session.userSocialsMobile.presentation.header;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.userSocialsMobile.data.header.UserSocialsMobileHeaderMapper;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileDTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/header/UserSocialsMobileHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileDTO;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/header/UserSocialsMobileHeaderVO;", "Lru/ozon/app/android/session/userSocialsMobile/data/header/UserSocialsMobileHeaderMapper;", "mapper", "<init>", "(Lru/ozon/app/android/session/userSocialsMobile/data/header/UserSocialsMobileHeaderMapper;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/session/userSocialsMobile/data/header/UserSocialsMobileHeaderMapper;", "getMapper", "()Lru/ozon/app/android/session/userSocialsMobile/data/header/UserSocialsMobileHeaderMapper;", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/header/UserSocialsMobileHeaderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UserSocialsMobileHeaderViewMapper extends WidgetViewMapper<UserSocialsMobileDTO, UserSocialsMobileHeaderVO> {

    @NotNull
    private final Function2<View, ComposerReferences, UserSocialsMobileHeaderViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final UserSocialsMobileHeaderMapper mapper;

    public UserSocialsMobileHeaderViewMapper(@NotNull UserSocialsMobileHeaderMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.layout = R$layout.widget_user_socials_mobile_header;
        this.holderProducer = UserSocialsMobileHeaderViewMapper$holderProducer$1.INSTANCE;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserSocialsMobileHeaderViewMapper) && Intrinsics.d(this.mapper, ((UserSocialsMobileHeaderViewMapper) other).mapper);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<UserSocialsMobileHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    public int hashCode() {
        return this.mapper.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserSocialsMobileHeaderViewMapper(mapper=" + this.mapper + ")";
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<UserSocialsMobileDTO, d, List<UserSocialsMobileHeaderVO>> getMapper() {
        return this.mapper;
    }
}
