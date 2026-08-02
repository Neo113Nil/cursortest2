package ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.di;

import Pc.a;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.di.EdoDatePickerComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation.EdoDatePickerViewModel;

/* loaded from: classes12.dex */
public final class DaggerEdoDatePickerComponent {

    private static final class EdoDatePickerComponentImpl implements EdoDatePickerComponent {
        private final EdoDatePickerComponentImpl edoDatePickerComponentImpl;
        private a<EdoDatePickerViewModel> edoDatePickerViewModelProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final EdoDatePickerComponentImpl edoDatePickerComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92635id;

            SwitchingProvider(EdoDatePickerComponentImpl edoDatePickerComponentImpl, int i11) {
                this.edoDatePickerComponentImpl = edoDatePickerComponentImpl;
                this.f92635id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92635id == 0) {
                    return (T) new EdoDatePickerViewModel();
                }
                throw new AssertionError(this.f92635id);
            }
        }

        /* synthetic */ EdoDatePickerComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.edoDatePickerViewModelProvider = new SwitchingProvider(this.edoDatePickerComponentImpl, 0);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.di.EdoDatePickerComponent
        public a<EdoDatePickerViewModel> getViewModelProvider() {
            return this.edoDatePickerViewModelProvider;
        }

        private EdoDatePickerComponentImpl() {
            this.edoDatePickerComponentImpl = this;
            initialize();
        }
    }

    private static final class Factory implements EdoDatePickerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.di.EdoDatePickerComponent.Factory
        public EdoDatePickerComponent create() {
            return new EdoDatePickerComponentImpl(0);
        }

        private Factory() {
        }
    }

    public static EdoDatePickerComponent.Factory factory() {
        return new Factory(0);
    }
}
