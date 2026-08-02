package ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.data;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004R*\u0010\u0005\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/stickyBehaviorBarrier/data/StickyBehaviorBarrierConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/commonwidgets/widgets/stickyBehaviorBarrier/data/StickyBehaviorBarrierDTO;", "<init>", "()V", "parser", "Lkotlin/Function2;", "", "getParser", "()Lkotlin/jvm/functions/Function2;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickyBehaviorBarrierConfig implements Config<StickyBehaviorBarrierDTO> {

    @NotNull
    private final Function2<String, String, StickyBehaviorBarrierDTO> parser = StickyBehaviorBarrierConfig$parser$1.INSTANCE;

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, StickyBehaviorBarrierDTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return Config.DefaultImpls.getSupportedPlaceholders(this);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return Config.DefaultImpls.getSupportedVersions(this);
    }

    @Override // j20.InterfaceC7243a
    public StickyBehaviorBarrierDTO parse(@NotNull C7244b c7244b) {
        return (StickyBehaviorBarrierDTO) Config.DefaultImpls.parse(this, c7244b);
    }
}
