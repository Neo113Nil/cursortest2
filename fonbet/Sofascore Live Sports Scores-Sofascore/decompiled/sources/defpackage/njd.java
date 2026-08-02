package defpackage;

import android.view.View;
import com.iab.omid.library.adsbynimbus.adsession.AdEvents;
import com.iab.omid.library.adsbynimbus.adsession.AdSession;
import com.iab.omid.library.adsbynimbus.adsession.CreativeType;
import com.iab.omid.library.adsbynimbus.adsession.ErrorType;
import com.iab.omid.library.adsbynimbus.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.adsbynimbus.adsession.Owner;
import com.iab.omid.library.adsbynimbus.adsession.media.InteractionType;
import com.iab.omid.library.adsbynimbus.adsession.media.MediaEvents;
import com.iab.omid.library.adsbynimbus.adsession.media.Position;
import com.iab.omid.library.adsbynimbus.adsession.media.VastProperties;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class njd implements nf {
    public static final mqi i = ypa.b(zg3.A);
    public final ArrayList a;
    public final of b;
    public final Owner c;
    public final mqi d;
    public boolean e;
    public final mqi f;
    public final mqi g;
    public final mqi h;

    public njd(CreativeType creativeType, ArrayList arrayList, of ofVar) {
        creativeType.getClass();
        ofVar.getClass();
        this.a = arrayList;
        this.b = ofVar;
        this.c = creativeType == CreativeType.VIDEO ? Owner.NATIVE : Owner.NONE;
        this.d = ypa.b(new mjd(creativeType, this, 1));
        this.f = ypa.b(new mjd(this, creativeType));
        this.g = ypa.b(new jmc(this, 18));
        this.h = ypa.b(new mjd(creativeType, this, 2));
    }

    public final AdSession a() {
        Object value = this.f.getValue();
        value.getClass();
        return (AdSession) value;
    }

    public final MediaEvents b() {
        return (MediaEvents) this.h.getValue();
    }

    @Override // defpackage.nf
    public final void onAdEvent(zf zfVar) {
        Pair pair;
        MediaEvents b;
        zfVar.getClass();
        try {
            int ordinal = zfVar.ordinal();
            mqi mqiVar = this.g;
            of ofVar = this.b;
            switch (ordinal) {
                case 0:
                    if (!this.e) {
                        Unit unit = null;
                        VastProperties createVastPropertiesForNonSkippableMedia = b() != null ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : null;
                        Object value = mqiVar.getValue();
                        value.getClass();
                        AdEvents adEvents = (AdEvents) value;
                        a().registerAdView(ofVar.f());
                        Iterator it = ofVar.e.iterator();
                        while (it.hasNext()) {
                            View view = (View) it.next();
                            if (view.getId() == R.id.nimbus_mute) {
                                pair = new Pair(FriendlyObstructionPurpose.VIDEO_CONTROLS, "Mute Button");
                            } else if (view.getId() == R.id.nimbus_close) {
                                pair = new Pair(FriendlyObstructionPurpose.CLOSE_AD, "Close Button");
                            } else {
                                if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && view.getVisibility() == 0) {
                                    Object tag = view.getTag(R.id.nimbus_obstruction);
                                    FriendlyObstructionPurpose friendlyObstructionPurpose = tag instanceof FriendlyObstructionPurpose ? (FriendlyObstructionPurpose) tag : null;
                                    pair = friendlyObstructionPurpose != null ? new Pair(friendlyObstructionPurpose, view.getContentDescription().toString()) : null;
                                }
                                pair = new Pair(FriendlyObstructionPurpose.NOT_VISIBLE, "Invisible");
                            }
                            if (pair != null) {
                                Object obj = pair.b;
                                a().addFriendlyObstruction(view, (FriendlyObstructionPurpose) pair.a, (String) obj);
                                Unit unit2 = Unit.a;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Registered ");
                                String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                sb.append(lowerCase);
                                sb.append(" friendly obstruction");
                                cjb.a(sb.toString());
                            }
                        }
                        a().start();
                        if (createVastPropertiesForNonSkippableMedia != null) {
                            adEvents.loaded(createVastPropertiesForNonSkippableMedia);
                            unit = Unit.a;
                        }
                        if (unit == null) {
                            adEvents.loaded();
                        }
                        this.e = true;
                        break;
                    }
                    break;
                case 1:
                    if (this.e) {
                        MediaEvents b2 = b();
                        if (b2 != null) {
                            b2.start(ofVar.e(), ofVar.g() / 100.0f);
                        }
                        Object value2 = mqiVar.getValue();
                        value2.getClass();
                        ((AdEvents) value2).impressionOccurred();
                        break;
                    }
                    break;
                case 2:
                    MediaEvents b3 = b();
                    if (b3 != null) {
                        b3.adUserInteraction(InteractionType.CLICK);
                        break;
                    }
                    break;
                case 3:
                    MediaEvents b4 = b();
                    if (b4 != null) {
                        b4.pause();
                        break;
                    }
                    break;
                case 4:
                    MediaEvents b5 = b();
                    if (b5 != null) {
                        b5.resume();
                        break;
                    }
                    break;
                case 5:
                    MediaEvents b6 = b();
                    if (b6 != null) {
                        b6.firstQuartile();
                        break;
                    }
                    break;
                case 6:
                    MediaEvents b7 = b();
                    if (b7 != null) {
                        b7.midpoint();
                        break;
                    }
                    break;
                case 7:
                    MediaEvents b8 = b();
                    if (b8 != null) {
                        b8.thirdQuartile();
                        break;
                    }
                    break;
                case 8:
                    MediaEvents b9 = b();
                    if (b9 != null) {
                        b9.complete();
                        break;
                    }
                    break;
                case 10:
                    if (this.e) {
                        a().finish();
                        break;
                    }
                    break;
                case 11:
                    if (this.e && (b = b()) != null) {
                        b.volumeChange(ofVar.g() / 100.0f);
                        break;
                    }
                    break;
            }
        } catch (Exception e) {
            cjb.a(e.toString());
        }
    }

    @Override // defpackage.pcd
    public final void onError(qcd qcdVar) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            if (this.e) {
                a().error(ErrorType.GENERIC, qcdVar.getMessage());
            }
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            cjb.a(a.toString());
        }
    }
}
