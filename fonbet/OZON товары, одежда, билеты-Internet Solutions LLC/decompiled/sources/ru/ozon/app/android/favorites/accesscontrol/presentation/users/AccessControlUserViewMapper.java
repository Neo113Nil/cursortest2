package ru.ozon.app.android.favorites.accesscontrol.presentation.users;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlDTO;
import ru.ozon.app.android.favorites.accesscontrol.data.AreaDTO;
import ru.ozon.app.android.favorites.accesscontrol.data.UserDTO;
import ru.ozon.app.android.favorites.accesscontrol.di.AccessControlWidgetComponent;
import ru.ozon.app.android.favorites.accesscontrol.presentation.AccessControlUserDecoration;
import ru.ozon.app.android.favorites.accesscontrol.presentation.author.AuthorImageVO;
import ru.ozon.app.android.favorites.feature.R$layout;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR6\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001fj\u0002` \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R,\u0010-\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$¨\u0006/"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/favorites/accesscontrol/di/AccessControlWidgetComponent;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlDTO;", "Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserVO;", "<init>", "()V", "Lru/ozon/app/android/favorites/accesscontrol/data/UserDTO;", "", "stateId", "Landroid/content/Context;", "context", "listName", "toVo", "(Lru/ozon/app/android/favorites/accesscontrol/data/UserDTO;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserVO;", "Lru/ozon/app/android/favorites/accesscontrol/data/AreaDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "(Lru/ozon/app/android/favorites/accesscontrol/data/AreaDTO;Landroid/content/Context;)Lru/ozon/uni/atoms/data/AtomDTO;", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserWidgetViewHolder;", "holderProducer", "getHolderProducer", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AccessControlUserViewMapper extends WidgetViewMapper2<AccessControlWidgetComponent, AccessControlDTO, AccessControlUserVO> {

    @NotNull
    private final Function2<AccessControlDTO, d, List<AccessControlUserVO>> mapper = new AccessControlUserViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_access_control_user;

    @NotNull
    private final Function2<View, ComposerReferences, AccessControlUserWidgetViewHolder> holderProducer = new AccessControlUserViewMapper$holderProducer$1(this);

    private final AtomDTO atom(AreaDTO areaDTO, Context context) {
        if (areaDTO.getRole() != null) {
            return new TextAtom(OzonSpannableStringKt.toOzonSpannableString(areaDTO.getRole()), null, UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, 122, null);
        }
        if (areaDTO.getControlButton() == null) {
            return null;
        }
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(areaDTO.getControlButton().getTitle());
        if (areaDTO.getControlButton().getAction() != null) {
            ozonSpannableString.setSpan(new ForegroundColorSpan(StyleParser.INSTANCE.parseColor(context, UniColors.TEXT_ACTION.getToken(), R$color.text_action)), 0, areaDTO.getControlButton().getTitle().length(), 33);
        }
        return new ButtonV3Atom.SmallBorderlessButton(ozonSpannableString, areaDTO.getControlButton().getAction(), null, null, null, areaDTO.getControlButton().getTrackingInfo(), false, 92, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessControlUserVO toVo(UserDTO userDTO, String str, Context context, String str2) {
        long hashCode = Arrays.hashCode(new Object[]{"AccessControlUser", str, userDTO});
        String name = userDTO.getName();
        String icon = userDTO.getIcon();
        String initials = userDTO.getInitials();
        AuthorImageVO authorImageVO = new AuthorImageVO(icon, initials != null ? h.q0(2, initials) : null);
        AreaDTO area = userDTO.getArea();
        return new AccessControlUserVO(hashCode, str2, name, authorImageVO, area != null ? atom(area, context) : null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new AccessControlUserDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AccessControlUserWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AccessControlDTO, d, List<AccessControlUserVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AccessControlWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AccessControlWidgetComponent.INSTANCE.create(storage);
    }
}
