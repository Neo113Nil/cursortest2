package ru.ozon.app.android.marketing.widgets.badgeTimer.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.marketing.widgets.badgeTimer.di.BadgeTimerComponent;
import ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerMapper;
import ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerMapper_Factory;
import ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerViewModelImpl;
import ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerViewModelImpl_Factory;

/* loaded from: classes12.dex */
public final class DaggerBadgeTimerComponent {

    private static final class BadgeTimerComponentImpl implements BadgeTimerComponent {
        private final BadgeTimerComponentImpl badgeTimerComponentImpl;
        private a<BadgeTimerMapper> badgeTimerMapperProvider;

        /* synthetic */ BadgeTimerComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.badgeTimerMapperProvider = d.b(BadgeTimerMapper_Factory.create());
        }

        @Override // ru.ozon.app.android.marketing.widgets.badgeTimer.di.BadgeTimerComponent
        public BadgeTimerMapper getMapper() {
            return this.badgeTimerMapperProvider.get();
        }

        @Override // ru.ozon.app.android.marketing.widgets.badgeTimer.di.BadgeTimerComponent
        public a<BadgeTimerViewModelImpl> getViewModelProvider() {
            return BadgeTimerViewModelImpl_Factory.create();
        }

        private BadgeTimerComponentImpl() {
            this.badgeTimerComponentImpl = this;
            initialize();
        }
    }

    private static final class Factory implements BadgeTimerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.marketing.widgets.badgeTimer.di.BadgeTimerComponent.Factory
        public BadgeTimerComponent create() {
            return new BadgeTimerComponentImpl(0);
        }

        private Factory() {
        }
    }

    public static BadgeTimerComponent.Factory factory() {
        return new Factory(0);
    }
}
