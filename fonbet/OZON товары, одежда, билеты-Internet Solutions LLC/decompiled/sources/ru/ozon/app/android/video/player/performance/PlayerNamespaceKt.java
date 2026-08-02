package ru.ozon.app.android.video.player.performance;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u0001*\u00060\u0001j\u0002`\u0004H\u0002*\f\b\u0000\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0006"}, d2 = {"PlayerWidgetInfo", "", "mapToPlayerNamespace", "Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "Lru/ozon/app/android/video/player/performance/PlayerWidgetInfo;", "trimWidgetVersion", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerNamespaceKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        return ru.ozon.app.android.video.player.performance.PlayerNamespace.GALLERY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r1.equals("products.skuList") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        return ru.ozon.app.android.video.player.performance.PlayerNamespace.TILE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r1.equals("products.tileGrid2") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1.equals("products.skuScroll") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r1.equals("products.skuGrid3") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r1.equals("products.skuGrid2") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r1.equals("products.skuGrid1") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r1.equals("pdp.galleryFullView") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r1.equals("pdp.gallery") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1.equals("pdp.galleryPreview") == false) goto L46;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PlayerNamespace mapToPlayerNamespace(String str) {
        if (str == null) {
            return PlayerNamespace.OTHER;
        }
        String trimWidgetVersion = trimWidgetVersion(str);
        switch (trimWidgetVersion.hashCode()) {
            case -1982983555:
                if (trimWidgetVersion.equals("rpProduct.reviewGallery")) {
                    return PlayerNamespace.REVIEW;
                }
                return PlayerNamespace.OTHER;
            case -1235683996:
                if (trimWidgetVersion.equals("rtb.advVideoBannerMobile")) {
                    return PlayerNamespace.ADV;
                }
                return PlayerNamespace.OTHER;
            case 225541216:
                break;
            case 521171540:
                break;
            case 1420970968:
                break;
            case 1420970969:
                break;
            case 1420970970:
                break;
            case 1430404672:
                break;
            case 1524158356:
                break;
            case 1569999057:
                break;
            case 2010993480:
                break;
            default:
                return PlayerNamespace.OTHER;
        }
    }

    private static final String trimWidgetVersion(String str) {
        List l11 = h.l(str, new char[]{'.'}, 0, 6);
        return l11.size() >= 3 ? C7714v.V(l11.subList(0, 2), ".", null, null, null, 62) : str;
    }
}
