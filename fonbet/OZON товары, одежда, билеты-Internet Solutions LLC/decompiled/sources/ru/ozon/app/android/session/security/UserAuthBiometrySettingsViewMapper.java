package ru.ozon.app.android.session.security;

import Fb0.a;
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
import ru.ozon.app.android.session.security.data.UserAuthBiometrySettingsDTO;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometrySettingsMapper;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometrySettingsVO;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewHolder;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewModelImpl;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/session/security/UserAuthBiometrySettingsViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/security/data/UserAuthBiometrySettingsDTO;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsVO;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsMapper;", "mapper", "LFb0/a;", "biometryAuth", "LPc/a;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModelImpl;", "providerViewModel", "<init>", "(Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsMapper;LFb0/a;LPc/a;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsMapper;", "getMapper", "()Lru/ozon/app/android/session/security/presentation/UserAuthBiometrySettingsMapper;", "LFb0/a;", "LPc/a;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserAuthBiometrySettingsViewMapper extends WidgetViewMapper<UserAuthBiometrySettingsDTO, UserAuthBiometrySettingsVO> {

    @NotNull
    private final a biometryAuth;

    @NotNull
    private final Function2<View, ComposerReferences, UserAuthBiometryViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final UserAuthBiometrySettingsMapper mapper;

    @NotNull
    private final Pc.a<UserAuthBiometryViewModelImpl> providerViewModel;

    public UserAuthBiometrySettingsViewMapper(@NotNull UserAuthBiometrySettingsMapper mapper, @NotNull a biometryAuth, @NotNull Pc.a<UserAuthBiometryViewModelImpl> providerViewModel) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(biometryAuth, "biometryAuth");
        Intrinsics.checkNotNullParameter(providerViewModel, "providerViewModel");
        this.mapper = mapper;
        this.biometryAuth = biometryAuth;
        this.providerViewModel = providerViewModel;
        this.layout = R$layout.user_auth_biometry_setting;
        this.holderProducer = new UserAuthBiometrySettingsViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return this.biometryAuth.available();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<UserAuthBiometrySettingsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<UserAuthBiometrySettingsDTO, d, List<UserAuthBiometrySettingsVO>> getMapper() {
        return this.mapper;
    }
}
