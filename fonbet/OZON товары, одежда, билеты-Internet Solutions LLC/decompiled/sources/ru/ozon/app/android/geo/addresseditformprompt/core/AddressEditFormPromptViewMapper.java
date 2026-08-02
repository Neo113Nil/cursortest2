package ru.ozon.app.android.geo.addresseditformprompt.core;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.addresseditformprompt.data.AddressEditFormPromptDTO;
import ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent;
import ru.ozon.app.android.geo.addresseditformprompt.presentation.AddressEditFormPromptVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R2\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/core/AddressEditFormPromptViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/geo/addresseditformprompt/data/AddressEditFormPromptDTO;", "Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVO;", "Lru/ozon/app/android/geo/addresseditformprompt/di/AddressEditFormPromptWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addresseditformprompt/di/AddressEditFormPromptWidgetComponent;)V", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVO;Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVO;)Ljava/lang/Object;", "Lru/ozon/app/android/geo/addresseditformprompt/di/AddressEditFormPromptWidgetComponent;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/geo/addresseditformprompt/core/AddressEditFormPromptMapper;", "getMapper", "()Lru/ozon/app/android/geo/addresseditformprompt/core/AddressEditFormPromptMapper;", "mapper", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditFormPromptViewMapper extends WidgetViewMapper<AddressEditFormPromptDTO, AddressEditFormPromptVO> {

    @NotNull
    private final AddressEditFormPromptWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddressEditFormPromptVO>> holderProducer;
    private final int layout;

    public AddressEditFormPromptViewMapper(@NotNull AddressEditFormPromptWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.layout = R$layout.widget_address_edit_form_prompt;
        this.holderProducer = new AddressEditFormPromptViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressEditFormPromptVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddressEditFormPromptDTO, d, List<AddressEditFormPromptVO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AddressEditFormPromptVO oldItem, @NotNull AddressEditFormPromptVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Unit.f71690a;
    }
}
