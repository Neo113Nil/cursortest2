package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import GZ.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.ValidateAddressResponseDTO;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVO;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.SuggestionVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/SuggestionVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/navigation/addressSearch/domain/SuggestionVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressSearchViewModelImpl$suggestClicked$5 extends AbstractC7737t implements Function1<SuggestionVO, Unit> {
    final /* synthetic */ MapSdkSuggestionVO $suggest;
    final /* synthetic */ AddressSearchViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModelImpl$suggestClicked$5$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ SuggestionVO $response;
        final /* synthetic */ MapSdkSuggestionVO $suggest;
        final /* synthetic */ AddressSearchViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SuggestionVO suggestionVO, AddressSearchViewModelImpl addressSearchViewModelImpl, MapSdkSuggestionVO mapSdkSuggestionVO) {
            super(0);
            this.$response = suggestionVO;
            this.this$0 = addressSearchViewModelImpl;
            this.$suggest = mapSdkSuggestionVO;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String link;
            g gVar;
            String errorText = this.$response.getErrorText();
            if (errorText != null && errorText.length() != 0) {
                this.this$0.showError(this.$response.getErrorText(), this.$response.getSearchText());
                return;
            }
            if (!this.$response.getIsExact()) {
                this.this$0.updateSearchViewValue(this.$suggest.getSearchText());
                return;
            }
            ValidateAddressResponseDTO.ActionDTO action = this.$response.getAction();
            if (action != null) {
                if (!Intrinsics.d(action.getBehavior(), "BEHAVIOR_TYPE_REDIRECT")) {
                    action = null;
                }
                if (action == null || (link = action.getLink()) == null) {
                    return;
                }
                gVar = this.this$0.ozonRouter;
                g.a.a(gVar, link, null, null, 6);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSearchViewModelImpl$suggestClicked$5(AddressSearchViewModelImpl addressSearchViewModelImpl, MapSdkSuggestionVO mapSdkSuggestionVO) {
        super(1);
        this.this$0 = addressSearchViewModelImpl;
        this.$suggest = mapSdkSuggestionVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SuggestionVO suggestionVO) {
        invoke2(suggestionVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SuggestionVO suggestionVO) {
        HandlersInhibitor handlersInhibitor;
        handlersInhibitor = this.this$0.inhibitor;
        HandlersInhibitor.run$default(handlersInhibitor, 0L, new AnonymousClass1(suggestionVO, this.this$0, this.$suggest), 1, null);
    }
}
