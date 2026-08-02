package ru.ozon.app.android.video.player;

import ZY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R,\u0010\t\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/video/player/CdnChooserSdkVideoService;", "", "Lkotlin/Function0;", "", "LZY/a$c;", "getCdnVideoRulesProvider", "()Lkotlin/jvm/functions/Function0;", "setCdnVideoRulesProvider", "(Lkotlin/jvm/functions/Function0;)V", "cdnVideoRulesProvider", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CdnChooserSdkVideoService {
    Function0<List<a.c>> getCdnVideoRulesProvider();

    void setCdnVideoRulesProvider(Function0<? extends List<? extends a.c>> function0);
}
