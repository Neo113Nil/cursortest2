package com.vk.libvideo.api.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.common.AdSection;
import com.vk.dto.common.InstreamAd;
import com.vk.libvideo.api.ad.AdChoice;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.stat.scheme.CommonVideoAdsStat$CommonFields;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdClose;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdMenuAction;
import io.reactivex.rxjava3.core.q;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.lyr0;
import xsna.md0;
import xsna.wc0;
import xsna.zrp;

/* compiled from: VideoAdvertisementsComponent.kt */
/* loaded from: classes2.dex */
public interface VideoAdvertisementsComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAdvertisementsComponent.kt */
    public static final class AdType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdType[] $VALUES;
        public static final AdType LIVE;
        public static final AdType VIDEO;

        static {
            AdType adType = new AdType("LIVE", 0);
            LIVE = adType;
            AdType adType2 = new AdType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = adType2;
            AdType[] adTypeArr = {adType, adType2};
            $VALUES = adTypeArr;
            $ENTRIES = new asp(adTypeArr);
        }

        public AdType() {
            throw null;
        }

        public static AdType valueOf(String str) {
            return (AdType) Enum.valueOf(AdType.class, str);
        }

        public static AdType[] values() {
            return (AdType[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoAdvertisementsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoAdvertisementsComponent STUB = new VideoAdvertisementsComponent() { // from class: com.vk.libvideo.api.di.VideoAdvertisementsComponent$Companion$STUB$1

            /* compiled from: VideoAdvertisementsComponent.kt */
            public static final class c implements md0 {
                @Override // xsna.md0
                public final boolean a(Context context, AdChoice adChoice) {
                    return false;
                }
            }

            @Override // com.vk.libvideo.api.di.VideoAdvertisementsComponent
            public final wc0 Z3(VideoAdvertisementsComponent.AdType adType) {
                return new d();
            }

            @Override // com.vk.libvideo.api.di.VideoAdvertisementsComponent
            public final md0 a8() {
                return new c();
            }

            @Override // com.vk.libvideo.api.di.VideoAdvertisementsComponent
            public final VideoAdvertisementsRepository pc() {
                return new b();
            }

            @Override // com.vk.libvideo.api.di.VideoAdvertisementsComponent
            public final lyr0 t4() {
                return new a();
            }

            /* compiled from: VideoAdvertisementsComponent.kt */
            public static final class d implements wc0 {
                @Override // xsna.wc0
                public final void b() {
                }

                @Override // xsna.wc0
                public final void e() {
                }

                @Override // xsna.wc0
                public final void g() {
                }

                @Override // xsna.wc0
                public final void a(String str) {
                }

                @Override // xsna.wc0
                public final void c(CommonVideoAdsStat$TypeOverlayAdMenuAction.MenuAction menuAction) {
                }

                @Override // xsna.wc0
                public final void d(CommonVideoAdsStat$TypeOverlayAdClose.CloseSource closeSource, CommonVideoAdsStat$TypeOverlayAdClose.CloseReason closeReason) {
                }

                @Override // xsna.wc0
                public final void f(boolean z, CommonVideoAdsStat$CommonFields.BannerType bannerType, wc0.a aVar) {
                }
            }

            /* compiled from: VideoAdvertisementsComponent.kt */
            public static final class b implements VideoAdvertisementsRepository {
                @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
                public final q<List<Long>> a() {
                    return q.T(EmptyList.b);
                }

                @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
                public final q<VideoAdvertisementsRepository.a> e(VideoAdvertisementsRepository.AdType adType, String str) {
                    return q.T(new VideoAdvertisementsRepository.a.C1194a(false));
                }

                @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
                public final VideoAdvertisementsRepository.a.c f() {
                    return null;
                }

                @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
                public final void c(VideoAdvertisementsRepository.AdType adType) {
                }

                @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
                public final void d(long j) {
                }

                @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
                public final void b(String str, AdSection adSection) {
                }

                @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
                public final void g(String str, InstreamAd instreamAd, String str2, String str3, long j) {
                }
            }

            /* compiled from: VideoAdvertisementsComponent.kt */
            public static final class a implements lyr0 {
                @Override // xsna.lyr0
                public final q<lyr0.a> b() {
                    return q.T(new lyr0.a.C3311a(false));
                }

                @Override // xsna.lyr0
                public final void a(String str, String str2) {
                }
            }
        };

        public final VideoAdvertisementsComponent getSTUB() {
            return STUB;
        }
    }

    wc0 Z3(AdType adType);

    md0 a8();

    VideoAdvertisementsRepository pc();

    lyr0 t4();
}
