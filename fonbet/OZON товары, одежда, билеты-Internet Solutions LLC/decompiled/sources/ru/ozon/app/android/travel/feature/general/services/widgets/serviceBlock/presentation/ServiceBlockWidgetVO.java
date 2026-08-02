package ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.ServiceBlockV4VO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0014B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;", "serviceBlock", "Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockWidgetVO$ServiceBlockTheme;", "theme", "<init>", "(JLru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockWidgetVO$ServiceBlockTheme;)V", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;", "getServiceBlock", "()Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockWidgetVO$ServiceBlockTheme;", "getTheme", "()Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockWidgetVO$ServiceBlockTheme;", "ServiceBlockTheme", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServiceBlockWidgetVO implements c {
    public static final int $stable = ServiceBlockV4VO.$stable;
    private final long id;

    @NotNull
    private final ServiceBlockV4VO serviceBlock;

    @NotNull
    private final ServiceBlockTheme theme;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockWidgetVO$ServiceBlockTheme;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SHADED", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class ServiceBlockTheme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ServiceBlockTheme[] $VALUES;
        public static final ServiceBlockTheme DEFAULT = new ServiceBlockTheme("DEFAULT", 0);
        public static final ServiceBlockTheme SHADED = new ServiceBlockTheme("SHADED", 1);

        private static final /* synthetic */ ServiceBlockTheme[] $values() {
            return new ServiceBlockTheme[]{DEFAULT, SHADED};
        }

        static {
            ServiceBlockTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ServiceBlockTheme(String str, int i11) {
        }

        public static ServiceBlockTheme valueOf(String str) {
            return (ServiceBlockTheme) Enum.valueOf(ServiceBlockTheme.class, str);
        }

        public static ServiceBlockTheme[] values() {
            return (ServiceBlockTheme[]) $VALUES.clone();
        }
    }

    public ServiceBlockWidgetVO(long j11, @NotNull ServiceBlockV4VO serviceBlock, @NotNull ServiceBlockTheme theme) {
        Intrinsics.checkNotNullParameter(serviceBlock, "serviceBlock");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.id = j11;
        this.serviceBlock = serviceBlock;
        this.theme = theme;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ServiceBlockV4VO getServiceBlock() {
        return this.serviceBlock;
    }

    @NotNull
    public final ServiceBlockTheme getTheme() {
        return this.theme;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
