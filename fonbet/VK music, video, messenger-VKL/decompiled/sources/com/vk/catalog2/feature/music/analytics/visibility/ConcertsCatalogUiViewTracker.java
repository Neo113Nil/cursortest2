package com.vk.catalog2.feature.music.analytics.visibility;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockConcert;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistViewItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Collections;
import java.util.List;
import xsna.asp;
import xsna.dha;
import xsna.hzp0;
import xsna.s1v;
import xsna.vha;
import xsna.z160;
import xsna.zrp;

/* compiled from: ConcertsCatalogUiViewTracker.kt */
/* loaded from: classes16.dex */
public final class ConcertsCatalogUiViewTracker extends z160 {
    public final EntryPoint f;
    public final s1v g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConcertsCatalogUiViewTracker.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint ARTIST_CARD;
        public static final EntryPoint SEARCH;

        static {
            EntryPoint entryPoint = new EntryPoint("ARTIST_CARD", 0);
            ARTIST_CARD = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("SEARCH", 1);
            SEARCH = entryPoint2;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        public EntryPoint() {
            throw null;
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public ConcertsCatalogUiViewTracker(EntryPoint entryPoint, s1v s1vVar, dha dhaVar) {
        super(s1vVar, dhaVar, 4);
        this.f = entryPoint;
        this.g = s1vVar;
    }

    @Override // xsna.vha, xsna.d680
    public final List<hzp0> j(Object obj) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        if (!(obj instanceof vha.b)) {
            return super.j(obj);
        }
        vha.b bVar = (vha.b) obj;
        UIBlock uIBlock = bVar.a;
        CommonAudioStat$TypeAudioArtistViewItem.RefSource refSource = null;
        UIBlockConcert uIBlockConcert = uIBlock instanceof UIBlockConcert ? (UIBlockConcert) uIBlock : null;
        if (uIBlockConcert == null) {
            return super.j(obj);
        }
        CatalogViewType catalogViewType = uIBlockConcert.d;
        EntryPoint entryPoint = EntryPoint.ARTIST_CARD;
        EntryPoint entryPoint2 = this.f;
        if (entryPoint2 == entryPoint && catalogViewType == CatalogViewType.SLIDER) {
            refSource = CommonAudioStat$TypeAudioArtistViewItem.RefSource.AUDIO_ARTIST_CONCERT;
        } else if (entryPoint2 == entryPoint && catalogViewType == CatalogViewType.LIST) {
            refSource = CommonAudioStat$TypeAudioArtistViewItem.RefSource.AUDIO_ARTIST_CONCERT_FULLPAGE;
        } else {
            EntryPoint entryPoint3 = EntryPoint.SEARCH;
            if (entryPoint2 == entryPoint3 && catalogViewType == CatalogViewType.SLIDER) {
                refSource = CommonAudioStat$TypeAudioArtistViewItem.RefSource.SEARCH_AUDIO_ARTIST_CONCERT;
            } else if (entryPoint2 == entryPoint3 && catalogViewType == CatalogViewType.LIST) {
                refSource = CommonAudioStat$TypeAudioArtistViewItem.RefSource.SEARCH_AUDIO_ARTIST_CONCERT_FULLPAGE;
            }
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, s1v.f(uIBlockConcert), this.g.e(uIBlockConcert), null, 38, null);
        String str = uIBlockConcert.z.d;
        if (str == null) {
            str = "";
        }
        CommonAudioStat$TypeAudioArtistViewItem commonAudioStat$TypeAudioArtistViewItem = new CommonAudioStat$TypeAudioArtistViewItem(new CommonStat$TypeTrackCodeItem(str), refSource);
        dha dhaVar = this.c;
        if (dhaVar == null || (mobileOfficialAppsCoreNavStat$EventScreen = dhaVar.a()) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        return Collections.singletonList(new hzp0.b(schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, commonAudioStat$TypeAudioArtistViewItem, bVar.b));
    }
}
