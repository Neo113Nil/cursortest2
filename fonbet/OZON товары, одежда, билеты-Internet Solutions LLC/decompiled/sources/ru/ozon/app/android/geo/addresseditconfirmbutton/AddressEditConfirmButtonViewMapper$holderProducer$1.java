package ru.ozon.app.android.geo.addresseditconfirmbutton;

import Vg.d;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent;
import ru.ozon.app.android.geo.mapupdater.MapUpdateProducer;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditConfirmButtonViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddressEditConfirmButtonViewHolder> {
    final /* synthetic */ AddressEditConfirmButtonViewMapper this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "formInfo", "", "", "link", "silent", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonViewMapper$holderProducer$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements InterfaceC6511n<Map<String, ? extends String>, String, Boolean, Unit> {
        final /* synthetic */ ComposerReferences $references;
        final /* synthetic */ AddressEditConfirmButtonViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AddressEditConfirmButtonViewMapper addressEditConfirmButtonViewMapper, ComposerReferences composerReferences) {
            super(3);
            this.this$0 = addressEditConfirmButtonViewMapper;
            this.$references = composerReferences;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map, String str, Boolean bool) {
            invoke((Map<String, String>) map, str, bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(Map<String, String> formInfo, String link, boolean z11) {
            FormDataUpdateHelper formDataUpdateHelper;
            Intrinsics.checkNotNullParameter(formInfo, "formInfo");
            Intrinsics.checkNotNullParameter(link, "link");
            formDataUpdateHelper = this.this$0.formDataUpdateHelper;
            formDataUpdateHelper.sendFormData(formInfo, link, this.$references.getController(), z11);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonViewMapper$holderProducer$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ AddressEditConfirmButtonViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AddressEditConfirmButtonViewMapper addressEditConfirmButtonViewMapper) {
            super(1);
            this.this$0 = addressEditConfirmButtonViewMapper;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Function1 function1;
            Intrinsics.checkNotNullParameter(it, "it");
            function1 = this.this$0.onClick;
            if (function1 != null) {
                function1.invoke(it);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditConfirmButtonViewMapper$holderProducer$1(AddressEditConfirmButtonViewMapper addressEditConfirmButtonViewMapper) {
        super(2);
        this.this$0 = addressEditConfirmButtonViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddressEditConfirmButtonViewHolder invoke(View view, ComposerReferences references) {
        AddressEditConfirmButtonWidgetComponent addressEditConfirmButtonWidgetComponent;
        AddressEditConfirmButtonWidgetComponent addressEditConfirmButtonWidgetComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        AddressEditConfirmButtonView addressEditConfirmButtonView = (AddressEditConfirmButtonView) view;
        addressEditConfirmButtonWidgetComponent = this.this$0.component;
        d customActionHandlersStoreFactory = addressEditConfirmButtonWidgetComponent.getCustomActionHandlersStoreFactory();
        B0 a11 = references.getViewModelOwnerProvider().a();
        final AddressEditConfirmButtonViewMapper addressEditConfirmButtonViewMapper = this.this$0;
        PvzSearcherViewModelImpl pvzSearcherViewModelImpl = (PvzSearcherViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddressEditConfirmButtonWidgetComponent addressEditConfirmButtonWidgetComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addressEditConfirmButtonWidgetComponent3 = AddressEditConfirmButtonViewMapper.this.component;
                PvzSearcherViewModelImpl pvzSearcherViewModel = addressEditConfirmButtonWidgetComponent3.getPvzSearcherViewModel();
                Intrinsics.g(pvzSearcherViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pvzSearcherViewModel;
            }
        }).a(PvzSearcherViewModelImpl.class);
        addressEditConfirmButtonWidgetComponent2 = this.this$0.component;
        return new AddressEditConfirmButtonViewHolder(addressEditConfirmButtonView, customActionHandlersStoreFactory, pvzSearcherViewModelImpl, new AnonymousClass2(this.this$0, references), new AnonymousClass3(this.this$0), references, new MapUpdateProducer(addressEditConfirmButtonWidgetComponent2.getMapUpdateManager()));
    }
}
