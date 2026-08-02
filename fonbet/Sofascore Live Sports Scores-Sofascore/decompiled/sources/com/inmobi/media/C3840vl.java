package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.appset.AppSetIdInfo;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.vl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3840vl extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3840vl(Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3840vl(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3840vl(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x003f, code lost:
    
        if (com.inmobi.media.C3839vk.b(r19) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0041, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0036, code lost:
    
        if (r2 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020d  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Context context;
        String string;
        String string2;
        String string3;
        String string4;
        int i;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        lu3 lu3Var = lu3.a;
        int i2 = this.a;
        if (i2 == 0) {
            y6a.M(obj);
            if (C3892xl.b) {
                return Unit.a;
            }
            C3694q4 c3694q4 = AbstractC3435g4.a;
            this.a = 1;
            Object b = AbstractC3435g4.a.b(this);
            if (b != lu3Var) {
                b = Unit.a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Yk.a();
                AppSetIdInfo appSetIdInfo = F1.a;
                String str2 = F8.a;
                F5 f5 = F5.a;
                f5.getClass();
                F5.h();
                F5.q();
                ((Boolean) F5.q.getValue()).getClass();
                ((Number) F5.f.getValue(f5, F5.b[0])).intValue();
                int i3 = AbstractC3551kh.a;
                Context context2 = AbstractC3424fj.a;
                if (i3 != Integer.MIN_VALUE) {
                    AbstractC3551kh.a = i3;
                    if (context2 != null) {
                        ConcurrentHashMap concurrentHashMap = Qa.b;
                        Pa.a(context2, "user_info_store").a("user_age", i3, false);
                    }
                }
                String str3 = AbstractC3551kh.c;
                Context context3 = AbstractC3424fj.a;
                if (str3 != null) {
                    AbstractC3551kh.c = str3;
                    if (context3 != null) {
                        ConcurrentHashMap concurrentHashMap2 = Qa.b;
                        Pa.a(context3, "user_info_store").a("user_age_group", str3, false);
                    }
                }
                String str4 = AbstractC3551kh.d;
                Context context4 = AbstractC3424fj.a;
                AbstractC3551kh.d = str4;
                if (context4 != null && str4 != null) {
                    ConcurrentHashMap concurrentHashMap3 = Qa.b;
                    Pa.a(context4, "user_info_store").a("user_area_code", str4, false);
                }
                String str5 = AbstractC3551kh.e;
                Context context5 = AbstractC3424fj.a;
                if (str5 != null) {
                    AbstractC3551kh.e = str5;
                    if (context5 != null) {
                        ConcurrentHashMap concurrentHashMap4 = Qa.b;
                        Pa.a(context5, "user_info_store").a("user_post_code", str5, false);
                    }
                }
                String str6 = AbstractC3551kh.f;
                Context context6 = AbstractC3424fj.a;
                if (str6 != null) {
                    AbstractC3551kh.f = str6;
                    if (context6 != null) {
                        ConcurrentHashMap concurrentHashMap5 = Qa.b;
                        Pa.a(context6, "user_info_store").a("user_city_code", str6, false);
                    }
                }
                String str7 = AbstractC3551kh.g;
                Context context7 = AbstractC3424fj.a;
                if (str7 != null) {
                    AbstractC3551kh.g = str7;
                    if (context7 != null) {
                        ConcurrentHashMap concurrentHashMap6 = Qa.b;
                        Pa.a(context7, "user_info_store").a("user_state_code", str7, false);
                    }
                }
                String str8 = AbstractC3551kh.h;
                Context context8 = AbstractC3424fj.a;
                if (str8 != null) {
                    AbstractC3551kh.h = str8;
                    if (context8 != null) {
                        ConcurrentHashMap concurrentHashMap7 = Qa.b;
                        Pa.a(context8, "user_info_store").a("user_country_code", str8, false);
                    }
                }
                int i4 = AbstractC3551kh.i;
                Context context9 = AbstractC3424fj.a;
                if (i4 != Integer.MIN_VALUE) {
                    AbstractC3551kh.i = i4;
                    if (context9 != null) {
                        ConcurrentHashMap concurrentHashMap8 = Qa.b;
                        Pa.a(context9, "user_info_store").a("user_yob", i4, false);
                    }
                }
                String str9 = AbstractC3551kh.j;
                Context context10 = AbstractC3424fj.a;
                if (str9 != null) {
                    AbstractC3551kh.j = str9;
                    if (context10 != null) {
                        ConcurrentHashMap concurrentHashMap9 = Qa.b;
                        Pa.a(context10, "user_info_store").a("user_gender", str9, false);
                    }
                }
                String str10 = AbstractC3551kh.k;
                Context context11 = AbstractC3424fj.a;
                if (str10 != null) {
                    AbstractC3551kh.k = str10;
                    if (context11 != null) {
                        ConcurrentHashMap concurrentHashMap10 = Qa.b;
                        Pa.a(context11, "user_info_store").a("user_education", str10, false);
                    }
                }
                String str11 = AbstractC3551kh.l;
                Context context12 = AbstractC3424fj.a;
                if (str11 != null) {
                    AbstractC3551kh.l = str11;
                    if (context12 != null) {
                        ConcurrentHashMap concurrentHashMap11 = Qa.b;
                        Pa.a(context12, "user_info_store").a("user_language", str11, false);
                    }
                }
                String str12 = AbstractC3551kh.m;
                Context context13 = AbstractC3424fj.a;
                if (str12 != null) {
                    AbstractC3551kh.m = str12;
                    if (context13 != null) {
                        ConcurrentHashMap concurrentHashMap12 = Qa.b;
                        Pa.a(context13, "user_info_store").a("user_interest", str12, false);
                    }
                }
                Location location = AbstractC3551kh.n;
                Context context14 = AbstractC3424fj.a;
                if (location != null) {
                    AbstractC3551kh.n = location;
                    if (context14 != null) {
                        String a = AbstractC3551kh.a(location);
                        ConcurrentHashMap concurrentHashMap13 = Qa.b;
                        str = "user_interest";
                        Pa.a(context14, "user_info_store").a("user_location", a, false);
                        int i5 = Integer.MIN_VALUE;
                        if (AbstractC3551kh.a == Integer.MIN_VALUE) {
                            Context context15 = AbstractC3424fj.a;
                            if (context15 != null) {
                                ConcurrentHashMap concurrentHashMap14 = Qa.b;
                                i5 = Pa.a(context15, "user_info_store").a.getInt("user_age", Integer.MIN_VALUE);
                            }
                            AbstractC3551kh.a = i5;
                        }
                        if (AbstractC3551kh.c == null) {
                            Context context16 = AbstractC3424fj.a;
                            if (context16 == null) {
                                string10 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap15 = Qa.b;
                                string10 = Pa.a(context16, "user_info_store").a.getString("user_age_group", null);
                            }
                            AbstractC3551kh.c = string10;
                        }
                        if (AbstractC3551kh.d == null) {
                            Context context17 = AbstractC3424fj.a;
                            if (context17 == null) {
                                string9 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap16 = Qa.b;
                                string9 = Pa.a(context17, "user_info_store").a.getString("user_area_code", null);
                            }
                            AbstractC3551kh.d = string9;
                        }
                        if (AbstractC3551kh.e == null) {
                            Context context18 = AbstractC3424fj.a;
                            if (context18 == null) {
                                string8 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap17 = Qa.b;
                                string8 = Pa.a(context18, "user_info_store").a.getString("user_post_code", null);
                            }
                            AbstractC3551kh.e = string8;
                        }
                        if (AbstractC3551kh.f == null) {
                            Context context19 = AbstractC3424fj.a;
                            if (context19 == null) {
                                string7 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap18 = Qa.b;
                                string7 = Pa.a(context19, "user_info_store").a.getString("user_city_code", null);
                            }
                            AbstractC3551kh.f = string7;
                        }
                        if (AbstractC3551kh.g == null) {
                            Context context20 = AbstractC3424fj.a;
                            if (context20 == null) {
                                string6 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap19 = Qa.b;
                                string6 = Pa.a(context20, "user_info_store").a.getString("user_state_code", null);
                            }
                            AbstractC3551kh.g = string6;
                        }
                        if (AbstractC3551kh.h == null) {
                            Context context21 = AbstractC3424fj.a;
                            if (context21 == null) {
                                string5 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap20 = Qa.b;
                                string5 = Pa.a(context21, "user_info_store").a.getString("user_country_code", null);
                            }
                            AbstractC3551kh.h = string5;
                        }
                        if (AbstractC3551kh.i == Integer.MIN_VALUE) {
                            Context context22 = AbstractC3424fj.a;
                            if (context22 == null) {
                                i = Integer.MIN_VALUE;
                            } else {
                                ConcurrentHashMap concurrentHashMap21 = Qa.b;
                                i = Pa.a(context22, "user_info_store").a.getInt("user_yob", Integer.MIN_VALUE);
                            }
                            AbstractC3551kh.i = i;
                        }
                        if (AbstractC3551kh.j == null) {
                            Context context23 = AbstractC3424fj.a;
                            if (context23 == null) {
                                string4 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap22 = Qa.b;
                                string4 = Pa.a(context23, "user_info_store").a.getString("user_gender", null);
                            }
                            AbstractC3551kh.j = string4;
                        }
                        if (AbstractC3551kh.k == null) {
                            Context context24 = AbstractC3424fj.a;
                            if (context24 == null) {
                                string3 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap23 = Qa.b;
                                string3 = Pa.a(context24, "user_info_store").a.getString("user_education", null);
                            }
                            AbstractC3551kh.k = string3;
                        }
                        if (AbstractC3551kh.l == null) {
                            Context context25 = AbstractC3424fj.a;
                            if (context25 == null) {
                                string2 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap24 = Qa.b;
                                string2 = Pa.a(context25, "user_info_store").a.getString("user_language", null);
                            }
                            AbstractC3551kh.l = string2;
                        }
                        if (AbstractC3551kh.m == null) {
                            Context context26 = AbstractC3424fj.a;
                            if (context26 == null) {
                                string = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap25 = Qa.b;
                                string = Pa.a(context26, "user_info_store").a.getString(str, null);
                            }
                            AbstractC3551kh.m = string;
                        }
                        AbstractC3551kh.b();
                        if (AbstractC3551kh.b == null && (context = AbstractC3424fj.a) != null) {
                            ConcurrentHashMap concurrentHashMap26 = Qa.b;
                            AbstractC3551kh.b = Boolean.valueOf(Pa.a(context, "user_info_store").a.getBoolean("user_age_restricted", false));
                        }
                        xw3.L(AbstractC3424fj.h, null, null, new C3398ej(new C3814ul(this.b, null), null), 3);
                        return Unit.a;
                    }
                }
                str = "user_interest";
                int i52 = Integer.MIN_VALUE;
                if (AbstractC3551kh.a == Integer.MIN_VALUE) {
                }
                if (AbstractC3551kh.c == null) {
                }
                if (AbstractC3551kh.d == null) {
                }
                if (AbstractC3551kh.e == null) {
                }
                if (AbstractC3551kh.f == null) {
                }
                if (AbstractC3551kh.g == null) {
                }
                if (AbstractC3551kh.h == null) {
                }
                if (AbstractC3551kh.i == Integer.MIN_VALUE) {
                }
                if (AbstractC3551kh.j == null) {
                }
                if (AbstractC3551kh.k == null) {
                }
                if (AbstractC3551kh.l == null) {
                }
                if (AbstractC3551kh.m == null) {
                }
                AbstractC3551kh.b();
                if (AbstractC3551kh.b == null) {
                    ConcurrentHashMap concurrentHashMap262 = Qa.b;
                    AbstractC3551kh.b = Boolean.valueOf(Pa.a(context, "user_info_store").a.getBoolean("user_age_restricted", false));
                }
                xw3.L(AbstractC3424fj.h, null, null, new C3398ej(new C3814ul(this.b, null), null), 3);
                return Unit.a;
            }
            y6a.M(obj);
        }
        this.a = 2;
    }
}
