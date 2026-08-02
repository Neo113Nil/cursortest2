package ru.ozon.app.android.video.player;

import ZY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R2\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/video/player/CdnChooserSdkVideoServiceImpl;", "Lru/ozon/app/android/video/player/CdnChooserSdkVideoService;", "<init>", "()V", "Lkotlin/Function0;", "", "LZY/a$c;", "cdnVideoRulesProvider", "Lkotlin/jvm/functions/Function0;", "getCdnVideoRulesProvider", "()Lkotlin/jvm/functions/Function0;", "setCdnVideoRulesProvider", "(Lkotlin/jvm/functions/Function0;)V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CdnChooserSdkVideoServiceImpl implements CdnChooserSdkVideoService {
    private volatile Function0<? extends List<? extends a.c>> cdnVideoRulesProvider;

    @Override // ru.ozon.app.android.video.player.CdnChooserSdkVideoService
    public Function0<List<a.c>> getCdnVideoRulesProvider() {
        return this.cdnVideoRulesProvider;
    }

    @Override // ru.ozon.app.android.video.player.CdnChooserSdkVideoService
    public void setCdnVideoRulesProvider(Function0<? extends List<? extends a.c>> function0) {
        this.cdnVideoRulesProvider = function0;
    }
}
