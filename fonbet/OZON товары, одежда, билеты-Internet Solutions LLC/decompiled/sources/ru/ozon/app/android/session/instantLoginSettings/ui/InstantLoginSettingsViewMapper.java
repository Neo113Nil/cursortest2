package ru.ozon.app.android.session.instantLoginSettings.ui;

import A00.a;
import Sh.b;
import Vg.d;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.instantLoginSettings.models.InstantLoginSettingsDTO;
import ru.ozon.app.android.session.instantLoginSettings.models.InstantLoginSettingsVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R:\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u0014j\u0002`\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R<\u0010,\u001a$\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030*j\b\u0012\u0004\u0012\u00020\u0003`+0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001c¨\u0006/"}, d2 = {"Lru/ozon/app/android/session/instantLoginSettings/ui/InstantLoginSettingsViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsDTO;", "Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;)V", "toggle", "(Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;)Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;)Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "LVg/d;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/session/instantLoginSettings/ui/Mapper;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Ljava/lang/Class;", "Lru/ozon/app/android/session/instantLoginSettings/ui/InstantLoginSettingsViewMapper$ToggleUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "ToggleUpdate", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstantLoginSettingsViewMapper extends WidgetViewMapper<InstantLoginSettingsDTO, InstantLoginSettingsVO> {

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Function2<View, ComposerReferences, k<InstantLoginSettingsVO>> holderProducer;

    @NotNull
    private final HandlersInhibitor inhibitor;
    private final int layout;

    @NotNull
    private final Function2<InstantLoginSettingsDTO, l20.d, List<InstantLoginSettingsVO>> mapper;

    @NotNull
    private final List<Class<ToggleUpdate>> supportedUpdates;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/instantLoginSettings/ui/InstantLoginSettingsViewMapper$ToggleUpdate;", "LA00/a$J$a;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToggleUpdate implements a.J.InterfaceC0007a {
        private final long id;

        public ToggleUpdate(long j11) {
            this.id = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToggleUpdate) && this.id == ((ToggleUpdate) other).id;
        }

        public final long getId() {
            return this.id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return b.b(this.id, "ToggleUpdate(id=", ")");
        }
    }

    public InstantLoginSettingsViewMapper(@NotNull HandlersInhibitor inhibitor, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.inhibitor = inhibitor;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.mapper = InstantLoginSettingsViewMapper$mapper$1.INSTANCE;
        this.layout = R$layout.instant_login_settings_item;
        this.supportedUpdates = C7714v.a0(ToggleUpdate.class);
        this.holderProducer = new InstantLoginSettingsViewMapper$holderProducer$1(this);
    }

    private final InstantLoginSettingsVO toggle(InstantLoginSettingsVO instantLoginSettingsVO) {
        return InstantLoginSettingsVO.copy$default(instantLoginSettingsVO, 0L, null, null, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.copy$default(instantLoginSettingsVO.getCell(), !instantLoginSettingsVO.getCell().isSelected(), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null), 7, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<InstantLoginSettingsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<InstantLoginSettingsDTO, l20.d, List<InstantLoginSettingsVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<ToggleUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public InstantLoginSettingsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull InstantLoginSettingsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return ((update instanceof ToggleUpdate) && ((ToggleUpdate) update).getId() == oldItem.getId()) ? toggle(oldItem) : oldItem;
    }
}
