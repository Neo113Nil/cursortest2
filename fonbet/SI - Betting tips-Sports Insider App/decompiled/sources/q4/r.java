package q4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import com.sports.insider.domain.workers.WorkerPrice;
import com.sports.insider.domain.workers.WorkerRemoteConfigFetch;
import com.sports.insider.domain.workers.WorkerTimerForAuthScreen;
import com.sports.insider.ui.viewpage.ViewCloudFragment;
import com.sports.insider.ui.views.AnalyticsView;
import com.sports.insider.ui.views.ArchiveTargetView;
import com.sports.insider.ui.views.HeadToHeadLabelView;
import com.sports.insider.ui.views.LastGamesNameLabel;
import com.sports.insider.ui.views.PredictionCard;
import com.sports.insider.ui.views.PredictionLabelView;
import e3.k0;
import e3.y;
import eg.m0;
import eg.z;
import hg.u;
import hg.u0;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import j$.time.Duration;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s7.t;
import ve.a0;
import ve.x0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22028b = i5;
        this.f22029c = obj;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22028b) {
            case 0:
                return new r((s) this.f22029c, continuation, 0);
            case 1:
                return new r((md.o) this.f22029c, continuation, 1);
            case 2:
                return new r((t) this.f22029c, continuation, 2);
            case 3:
                return new r((p0) this.f22029c, continuation, 3);
            case 4:
                return new r((se.p) this.f22029c, continuation, 4);
            case 5:
                return new r((t) this.f22029c, continuation, 5);
            case 6:
                return new r((ViewCloudFragment) this.f22029c, continuation, 6);
            case 7:
                return new r((AnalyticsView) this.f22029c, continuation, 7);
            case 8:
                return new r((ArchiveTargetView) this.f22029c, continuation, 8);
            case 9:
                return new r((HeadToHeadLabelView) this.f22029c, continuation, 9);
            case 10:
                return new r((LastGamesNameLabel) this.f22029c, continuation, 10);
            case 11:
                return new r((a0) this.f22029c, continuation, 11);
            case 12:
                return new r((PredictionCard) this.f22029c, continuation, 12);
            case 13:
                return new r((PredictionLabelView) this.f22029c, continuation, 13);
            case 14:
                return new r((x0) this.f22029c, continuation, 14);
            case 15:
                return new r((za.b) this.f22029c, continuation, 15);
            case 16:
                return new r((za.e) this.f22029c, continuation, 16);
            case 17:
                return new r((zc.j) this.f22029c, continuation, 17);
            default:
                return new r((Throwable) this.f22029c, continuation, 18);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22028b) {
        }
        return ((r) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer num;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        Continuation continuation = null;
        Integer num2 = null;
        String id2 = null;
        switch (this.f22028b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                s sVar = (s) this.f22029c;
                q qVar = sVar.f22032c;
                if (qVar != null) {
                    qVar.e();
                }
                sVar.f22032c = null;
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    y yVar = y.f8572a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    y networkType = y.f8573b;
                    Intrinsics.checkNotNullParameter(networkType, "networkType");
                    e3.f fVar = new e3.f(new n3.i(null), networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet) : g0.f19206a);
                    Intrinsics.checkNotNullParameter(WorkerRemoteConfigFetch.class, "workerClass");
                    e3.z zVar = (e3.z) new e3.z(WorkerRemoteConfigFetch.class).f(fVar);
                    e3.a aVar3 = e3.a.f8471a;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ((k0) y3.m(k0.class, null, 6)).c("WorkerInitRemoteConfig", e3.o.f8551a, (e3.a0) ((e3.z) ((e3.z) ((e3.z) zVar.e(aVar3, 5L, timeUnit)).g(30L, timeUnit)).a("WorkerInitRemoteConfig")).b());
                } catch (Exception e7) {
                    zc.d.b(4, "remoteConfigFetchSetWork", e7);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                k0 k0Var = (k0) y3.m(k0.class, null, 6);
                e3.o oVar = e3.o.f8552b;
                Intrinsics.checkNotNullParameter(WorkerPrice.class, "workerClass");
                e3.z zVar2 = new e3.z(WorkerPrice.class);
                y yVar2 = y.f8572a;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                y networkType2 = y.f8573b;
                Intrinsics.checkNotNullParameter(networkType2, "networkType");
                e3.z zVar3 = (e3.z) zVar2.f(new e3.f(new n3.i(null), networkType2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet2) : g0.f19206a));
                e3.a aVar5 = e3.a.f8471a;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                return k0Var.c("WorkerPrice", oVar, (e3.a0) ((e3.z) ((e3.z) ((e3.z) zVar3.e(aVar5, 15L, timeUnit2)).g(5L, timeUnit2)).a("TagWorkerPrice")).b());
            case 3:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                md.b bVar = new md.b();
                Context applicationContext = ((p0) this.f22029c).getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return bVar.a(applicationContext);
            case 4:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                se.p pVar = (se.p) this.f22029c;
                wc.i iVar = pVar.A;
                iVar.f25115f.getClass();
                u uVar = new u(u0.i(s7.u.e()), new oe.j(pVar, continuation, 28), 2);
                eg.y yVar3 = new eg.y("Room observer price");
                iVar.getClass();
                CoroutineContext c2 = kotlin.coroutines.e.c(yVar3, zc.a.f25907a);
                lg.e eVar = m0.f9201a;
                int i5 = 3;
                pVar.M = u0.p(new u(u0.n(uVar, c2.t(lg.d.f20063c)), new pd.k(i5, continuation, i5)), d1.i(pVar));
                return Unit.f19194a;
            case 5:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                k0 k0Var2 = (k0) y3.m(k0.class, null, 6);
                e3.o oVar2 = e3.o.f8551a;
                Intrinsics.checkNotNullParameter(WorkerTimerForAuthScreen.class, "workerClass");
                e3.z zVar4 = new e3.z(WorkerTimerForAuthScreen.class);
                n3.i iVar2 = new n3.i(null);
                y yVar4 = y.f8572a;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                int i10 = Build.VERSION.SDK_INT;
                e3.z zVar5 = (e3.z) zVar4.f(new e3.f(iVar2, yVar4, false, false, false, false, -1L, -1L, i10 >= 24 ? CollectionsKt.Z(linkedHashSet3) : g0.f19206a));
                if (i10 >= 26) {
                    e3.a backoffPolicy = e3.a.f8472b;
                    Duration duration = Duration.ofMinutes(30L);
                    Intrinsics.checkNotNullExpressionValue(duration, "ofMinutes(...)");
                    Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                    Intrinsics.checkNotNullParameter(duration, "duration");
                    zVar5.f8539a = true;
                    m3.o oVar3 = zVar5.f8541c;
                    oVar3.f20341l = backoffPolicy;
                    Intrinsics.checkNotNullParameter(duration, "<this>");
                    oVar3.d(duration.toMillis());
                }
                Unit unit = Unit.f19194a;
                return k0Var2.c("WorkerNameTimerForAuthScreen", oVar2, (e3.a0) ((e3.z) ((e3.z) zVar5.g(43200L, TimeUnit.SECONDS)).a("WorkerTagTimerForAuthScreen")).b());
            case 6:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                ViewCloudFragment viewCloudFragment = (ViewCloudFragment) this.f22029c;
                String productId = viewCloudFragment.f7063a;
                if (productId == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(PurchaseSubsTable.skuColumn);
                    productId = null;
                }
                int i11 = viewCloudFragment.f7069g;
                Intrinsics.checkNotNullParameter(productId, "productId");
                StringBuilder sb2 = new StringBuilder();
                Intrinsics.checkNotNullParameter("aHR0cHM6Ly9pbnNpZ2h0cy1iZXQuY29tL3Nwb3J0LWluc2lkZXIv", AdRevenueConstants.SOURCE_KEY);
                try {
                    byte[] decode = Base64.decode("aHR0cHM6Ly9pbnNpZ2h0cy1iZXQuY29tL3Nwb3J0LWluc2lkZXIv", 0);
                    Intrinsics.checkNotNull(decode);
                    Charset forName = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                    continuation = new String(decode, forName);
                } catch (UnsupportedEncodingException unused) {
                }
                sb2.append(String.valueOf(continuation));
                sb2.append(productId);
                sb2.append(i11 > 0 ? c1.i(i11, "/") : "");
                return sb2.toString();
            case 7:
                lf.a aVar10 = lf.a.f20034a;
                h8.b.B(obj);
                return ((AnalyticsView) this.f22029c).getContext().getResources().getString(R.string.Analytics);
            case 8:
                lf.a aVar11 = lf.a.f20034a;
                h8.b.B(obj);
                ArchiveTargetView archiveTargetView = (ArchiveTargetView) this.f22029c;
                return archiveTargetView.getContext().getResources().getString(archiveTargetView.f7127c);
            case 9:
                lf.a aVar12 = lf.a.f20034a;
                h8.b.B(obj);
                return ((HeadToHeadLabelView) this.f22029c).getContext().getResources().getString(R.string.meeting_history);
            case 10:
                lf.a aVar13 = lf.a.f20034a;
                h8.b.B(obj);
                return ((LastGamesNameLabel) this.f22029c).getContext().getResources().getString(R.string.last_games);
            case 11:
                lf.a aVar14 = lf.a.f20034a;
                h8.b.B(obj);
                return ((a0) this.f22029c).getContext().getResources().getString(R.string.live_dash_predictions);
            case 12:
                lf.a aVar15 = lf.a.f20034a;
                h8.b.B(obj);
                return ((PredictionCard) this.f22029c).getContext().getResources().getString(R.string.until_beginning);
            case 13:
                lf.a aVar16 = lf.a.f20034a;
                h8.b.B(obj);
                return ((PredictionLabelView) this.f22029c).getContext().getResources().getString(R.string.prediction);
            case 14:
                lf.a aVar17 = lf.a.f20034a;
                h8.b.B(obj);
                return ((x0) this.f22029c).getContext().getResources().getString(R.string.vip_access);
            case 15:
                lf.a aVar18 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(((zb.b) ((zb.a) y3.m(zb.a.class, null, 6))).f25906a);
                    if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        id2 = advertisingIdInfo.getId();
                    }
                    fa.a c8 = za.b.c();
                    long currentTimeMillis = System.currentTimeMillis();
                    c8.getClass();
                    Intrinsics.checkNotNullParameter("advertising_id_saved_at", "key");
                    SharedPreferences.Editor edit = c8.f9541a.edit();
                    edit.putLong("advertising_id_saved_at", currentTimeMillis);
                    edit.apply();
                    za.b.c().d("gaid", id2);
                } catch (Exception unused2) {
                }
                return Unit.f19194a;
            case 16:
                lf.a aVar19 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    za.e eVar2 = (za.e) this.f22029c;
                    bc.a a7 = za.e.a();
                    Context context = eVar2.f25898a;
                    a7.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return bc.a.a().getAppsFlyerUID(context);
                } catch (Exception unused3) {
                    return null;
                }
            case 17:
                zc.j jVar = (zc.j) this.f22029c;
                lf.a aVar20 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    za.f a10 = zc.j.a(jVar);
                    a10.getClass();
                    dc.a a11 = za.f.a();
                    Context context2 = a10.f25899a;
                    a11.getClass();
                    Intrinsics.checkNotNullParameter(context2, "context");
                    c6.c cVar = c6.c.f3657e;
                    Intrinsics.checkNotNullExpressionValue(cVar, "getInstance(...)");
                    num = new Integer(cVar.b(context2.getApplicationContext(), c6.d.f3659a));
                } catch (Exception unused4) {
                }
                try {
                    String str2 = gc.d.f9945a;
                    str = d2.i.c();
                } catch (Exception unused5) {
                    num2 = num;
                    str = "en";
                    num = num2;
                    if (num != null) {
                        hashCode7 = str.hashCode();
                        if (hashCode7 == 3201) {
                        }
                        return "Sign in with your Google Account in the Google Play Store app.";
                    }
                    if (num != null) {
                        hashCode6 = str.hashCode();
                        if (hashCode6 == 3201) {
                        }
                        return "Google Play services is currently being updated on this device.";
                    }
                    if (num != null) {
                        hashCode5 = str.hashCode();
                        if (hashCode5 == 3201) {
                        }
                        return "The installed version of Google Play services is out of date.";
                    }
                    if (num != null) {
                        hashCode4 = str.hashCode();
                        if (hashCode4 == 3201) {
                        }
                        return "The installed Google Play services package is not authentic.";
                    }
                    if (num != null) {
                        hashCode3 = str.hashCode();
                        if (hashCode3 == 3201) {
                        }
                        return "The installed version of Google Play services has been disabled on this device.";
                    }
                    if (num != null) {
                        hashCode2 = str.hashCode();
                        if (hashCode2 == 3201) {
                        }
                        return "Google Play services is missing on this device.";
                    }
                    hashCode = str.hashCode();
                    if (hashCode == 3201) {
                    }
                    return "Unknown error";
                }
                if (num != null && num.intValue() == 0) {
                    hashCode7 = str.hashCode();
                    if (hashCode7 == 3201) {
                        if (hashCode7 != 3246) {
                            if (hashCode7 != 3276) {
                                if (hashCode7 != 3588) {
                                    if (hashCode7 != 3651) {
                                        if (hashCode7 == 3710 && str.equals("tr")) {
                                            return "Google Play Store uygulamasında Google hesabınızla oturum açın.";
                                        }
                                    } else if (str.equals("ru")) {
                                        return "Войдите в свою учетную запись Google в приложении Google Play Маркет.";
                                    }
                                } else if (str.equals("pt")) {
                                    return "Inicie sessão com a sua conta Google na aplicação Google Play Store.";
                                }
                            } else if (str.equals("fr")) {
                                return "Connectez-vous avec votre compte Google dans l'application Google Play Store.";
                            }
                        } else if (str.equals("es")) {
                            return "Inicia sesión con tu cuenta de Google en la aplicación Google Play Store.";
                        }
                    } else if (str.equals("de")) {
                        return "Melden Sie sich mit Ihrem Google-Konto in der App Google Play Store an.";
                    }
                    return "Sign in with your Google Account in the Google Play Store app.";
                }
                if (num != null && num.intValue() == 18) {
                    hashCode6 = str.hashCode();
                    if (hashCode6 == 3201) {
                        if (hashCode6 != 3246) {
                            if (hashCode6 != 3276) {
                                if (hashCode6 != 3588) {
                                    if (hashCode6 != 3651) {
                                        if (hashCode6 == 3710 && str.equals("tr")) {
                                            return "Bu cihazda Google Play hizmetleri şu anda güncelleniyor.";
                                        }
                                    } else if (str.equals("ru")) {
                                        return "Службы Google Play в данный момент обновляются на этом устройстве.";
                                    }
                                } else if (str.equals("pt")) {
                                    return "Os serviços do Google Play estão a ser atualizados neste dispositivo.";
                                }
                            } else if (str.equals("fr")) {
                                return "Les services Google Play sont actuellement mis à jour sur cet appareil.";
                            }
                        } else if (str.equals("es")) {
                            return "Los servicios de Google Play se están actualizando actualmente en este dispositivo.";
                        }
                    } else if (str.equals("de")) {
                        return "Google Play-Dienste werden derzeit auf diesem Gerät aktualisiert.";
                    }
                    return "Google Play services is currently being updated on this device.";
                }
                if (num != null && num.intValue() == 2) {
                    hashCode5 = str.hashCode();
                    if (hashCode5 == 3201) {
                        if (hashCode5 != 3246) {
                            if (hashCode5 != 3276) {
                                if (hashCode5 != 3588) {
                                    if (hashCode5 != 3651) {
                                        if (hashCode5 == 3710 && str.equals("tr")) {
                                            return "Yüklü Google Play hizmetleri sürümü güncel değil.";
                                        }
                                    } else if (str.equals("ru")) {
                                        return "Установленная версия Служб Google Play устарела.";
                                    }
                                } else if (str.equals("pt")) {
                                    return "A versão instalada dos serviços do Google Play está desatualizada.";
                                }
                            } else if (str.equals("fr")) {
                                return "La version installée des services Google Play est obsolète.";
                            }
                        } else if (str.equals("es")) {
                            return "La versión instalada de los servicios de Google Play está desactualizada.";
                        }
                    } else if (str.equals("de")) {
                        return "Die installierte Version der Google Play-Dienste ist veraltet.";
                    }
                    return "The installed version of Google Play services is out of date.";
                }
                if (num != null && num.intValue() == 9) {
                    hashCode4 = str.hashCode();
                    if (hashCode4 == 3201) {
                        if (hashCode4 != 3246) {
                            if (hashCode4 != 3276) {
                                if (hashCode4 != 3588) {
                                    if (hashCode4 != 3651) {
                                        if (hashCode4 == 3710 && str.equals("tr")) {
                                            return "Yüklü Google Play hizmetleri paketi orijinal değil.";
                                        }
                                    } else if (str.equals("ru")) {
                                        return "Установленный пакет Служб Google Play недействителен или подделан.";
                                    }
                                } else if (str.equals("pt")) {
                                    return "O pacote dos serviços do Google Play instalado não é autêntico.";
                                }
                            } else if (str.equals("fr")) {
                                return "Le package des services Google Play installé n’est pas authentique.";
                            }
                        } else if (str.equals("es")) {
                            return "El paquete de servicios de Google Play instalado no es auténtico.";
                        }
                    } else if (str.equals("de")) {
                        return "Das installierte Paket der Google Play-Dienste ist nicht authentisch.";
                    }
                    return "The installed Google Play services package is not authentic.";
                }
                if (num != null && num.intValue() == 3) {
                    hashCode3 = str.hashCode();
                    if (hashCode3 == 3201) {
                        if (hashCode3 != 3246) {
                            if (hashCode3 != 3276) {
                                if (hashCode3 != 3588) {
                                    if (hashCode3 != 3651) {
                                        if (hashCode3 == 3710 && str.equals("tr")) {
                                            return "Yüklü Google Play hizmetleri sürümü bu cihazda devre dışı bırakılmış.";
                                        }
                                    } else if (str.equals("ru")) {
                                        return "Установленная версия Служб Google Play отключена на этом устройстве.";
                                    }
                                } else if (str.equals("pt")) {
                                    return "A versão instalada dos serviços do Google Play foi desativada neste dispositivo.";
                                }
                            } else if (str.equals("fr")) {
                                return "La version installée des services Google Play a été désactivée sur cet appareil.";
                            }
                        } else if (str.equals("es")) {
                            return "La versión instalada de los servicios de Google Play ha sido deshabilitada en este dispositivo.";
                        }
                    } else if (str.equals("de")) {
                        return "Die installierte Version der Google Play-Dienste wurde auf diesem Gerät deaktiviert.";
                    }
                    return "The installed version of Google Play services has been disabled on this device.";
                }
                if (num != null && num.intValue() == 1) {
                    hashCode2 = str.hashCode();
                    if (hashCode2 == 3201) {
                        if (hashCode2 != 3246) {
                            if (hashCode2 != 3276) {
                                if (hashCode2 != 3588) {
                                    if (hashCode2 != 3651) {
                                        if (hashCode2 == 3710 && str.equals("tr")) {
                                            return "Bu cihazda Google Play hizmetleri eksik.";
                                        }
                                    } else if (str.equals("ru")) {
                                        return "Службы Google Play отсутствуют на этом устройстве.";
                                    }
                                } else if (str.equals("pt")) {
                                    return "Os serviços do Google Play estão ausentes neste dispositivo.";
                                }
                            } else if (str.equals("fr")) {
                                return "Les services Google Play sont manquants sur cet appareil.";
                            }
                        } else if (str.equals("es")) {
                            return "Faltan los servicios de Google Play en este dispositivo.";
                        }
                    } else if (str.equals("de")) {
                        return "Google Play-Dienste fehlen auf diesem Gerät.";
                    }
                    return "Google Play services is missing on this device.";
                }
                hashCode = str.hashCode();
                if (hashCode == 3201) {
                    if (hashCode != 3246) {
                        if (hashCode != 3276) {
                            if (hashCode != 3588) {
                                if (hashCode != 3651) {
                                    if (hashCode == 3710 && str.equals("tr")) {
                                        return "Bilinmeyen hata";
                                    }
                                } else if (str.equals("ru")) {
                                    return "Неизвестная ошибка";
                                }
                            } else if (str.equals("pt")) {
                                return "Erro desconhecido";
                            }
                        } else if (str.equals("fr")) {
                            return "Erreur inconnue";
                        }
                    } else if (str.equals("es")) {
                        return "Error desconocido";
                    }
                } else if (str.equals("de")) {
                    return "Unbekannter Fehler";
                }
                return "Unknown error";
            default:
                lf.a aVar21 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((Throwable) this.f22029c).printStackTrace();
                } catch (Exception unused6) {
                }
                return Unit.f19194a;
        }
    }
}
