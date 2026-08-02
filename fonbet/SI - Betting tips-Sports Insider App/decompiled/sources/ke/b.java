package ke;

import com.sports.insider.ui.onboarding.BoardSiAcademyFragment;
import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19023b;

    /* renamed from: c, reason: collision with root package name */
    public int f19024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BoardSiAcademyFragment f19025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BoardSiAcademyFragment boardSiAcademyFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19023b = i5;
        this.f19025d = boardSiAcademyFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19023b) {
            case 0:
                return new b(this.f19025d, continuation, 0);
            default:
                return new b(this.f19025d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19023b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ec.a aVar;
        ec.a aVar2;
        ec.a aVar3;
        ec.a aVar4;
        ec.a aVar5;
        ec.a aVar6;
        int i5 = this.f19023b;
        BoardSiAcademyFragment boardSiAcademyFragment = this.f19025d;
        switch (i5) {
            case 0:
                lf.a aVar7 = lf.a.f20034a;
                int i10 = this.f19024c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    a aVar8 = new a(boardSiAcademyFragment, null, 1);
                    this.f19024c = 1;
                    obj = c0.A(dVar, aVar8, this);
                    if (obj == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj);
                                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                                CharSequence charSequence = (CharSequence) obj;
                                aVar3 = (ec.a) boardSiAcademyFragment.f22459a;
                                if (aVar3 != null) {
                                    aVar3.f8842b.setButtonText(charSequence);
                                }
                                return Unit.f19194a;
                            }
                            h8.b.B(obj);
                            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                            CharSequence charSequence2 = (CharSequence) obj;
                            aVar2 = (ec.a) boardSiAcademyFragment.f22459a;
                            if (aVar2 != null) {
                                aVar2.f8843c.setText(charSequence2);
                            }
                            lg.e eVar2 = m0.f9201a;
                            lg.d dVar2 = lg.d.f20063c;
                            a aVar9 = new a(boardSiAcademyFragment, null, 3);
                            this.f19024c = 4;
                            obj = c0.A(dVar2, aVar9, this);
                            if (obj == aVar7) {
                                return aVar7;
                            }
                            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                            CharSequence charSequence3 = (CharSequence) obj;
                            aVar3 = (ec.a) boardSiAcademyFragment.f22459a;
                            if (aVar3 != null) {
                            }
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        CharSequence charSequence4 = (CharSequence) obj;
                        aVar = (ec.a) boardSiAcademyFragment.f22459a;
                        if (aVar != null) {
                            aVar.f8849i.setText(charSequence4);
                        }
                        lg.e eVar3 = m0.f9201a;
                        lg.d dVar3 = lg.d.f20063c;
                        a aVar10 = new a(boardSiAcademyFragment, null, 2);
                        this.f19024c = 3;
                        obj = c0.A(dVar3, aVar10, this);
                        if (obj == aVar7) {
                            return aVar7;
                        }
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        CharSequence charSequence22 = (CharSequence) obj;
                        aVar2 = (ec.a) boardSiAcademyFragment.f22459a;
                        if (aVar2 != null) {
                        }
                        lg.e eVar22 = m0.f9201a;
                        lg.d dVar22 = lg.d.f20063c;
                        a aVar92 = new a(boardSiAcademyFragment, null, 3);
                        this.f19024c = 4;
                        obj = c0.A(dVar22, aVar92, this);
                        if (obj == aVar7) {
                        }
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        CharSequence charSequence32 = (CharSequence) obj;
                        aVar3 = (ec.a) boardSiAcademyFragment.f22459a;
                        if (aVar3 != null) {
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                CharSequence charSequence5 = (CharSequence) obj;
                ec.a aVar11 = (ec.a) boardSiAcademyFragment.f22459a;
                if (aVar11 != null) {
                    aVar11.j.setText(charSequence5);
                }
                lg.e eVar4 = m0.f9201a;
                lg.d dVar4 = lg.d.f20063c;
                a aVar12 = new a(boardSiAcademyFragment, null, 0);
                this.f19024c = 2;
                obj = c0.A(dVar4, aVar12, this);
                if (obj == aVar7) {
                    return aVar7;
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                CharSequence charSequence42 = (CharSequence) obj;
                aVar = (ec.a) boardSiAcademyFragment.f22459a;
                if (aVar != null) {
                }
                lg.e eVar32 = m0.f9201a;
                lg.d dVar32 = lg.d.f20063c;
                a aVar102 = new a(boardSiAcademyFragment, null, 2);
                this.f19024c = 3;
                obj = c0.A(dVar32, aVar102, this);
                if (obj == aVar7) {
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                CharSequence charSequence222 = (CharSequence) obj;
                aVar2 = (ec.a) boardSiAcademyFragment.f22459a;
                if (aVar2 != null) {
                }
                lg.e eVar222 = m0.f9201a;
                lg.d dVar222 = lg.d.f20063c;
                a aVar922 = new a(boardSiAcademyFragment, null, 3);
                this.f19024c = 4;
                obj = c0.A(dVar222, aVar922, this);
                if (obj == aVar7) {
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                CharSequence charSequence322 = (CharSequence) obj;
                aVar3 = (ec.a) boardSiAcademyFragment.f22459a;
                if (aVar3 != null) {
                }
                return Unit.f19194a;
            default:
                lf.a aVar13 = lf.a.f20034a;
                int i11 = this.f19024c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    lg.e eVar5 = m0.f9201a;
                    lg.d dVar5 = lg.d.f20063c;
                    a aVar14 = new a(boardSiAcademyFragment, null, 5);
                    this.f19024c = 1;
                    obj = c0.A(dVar5, aVar14, this);
                    if (obj == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj);
                                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                                CharSequence charSequence6 = (CharSequence) obj;
                                aVar6 = (ec.a) boardSiAcademyFragment.f22459a;
                                if (aVar6 != null) {
                                    aVar6.f8842b.setButtonText(charSequence6);
                                }
                                return Unit.f19194a;
                            }
                            h8.b.B(obj);
                            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                            CharSequence charSequence7 = (CharSequence) obj;
                            aVar5 = (ec.a) boardSiAcademyFragment.f22459a;
                            if (aVar5 != null) {
                                aVar5.f8843c.setText(charSequence7);
                            }
                            lg.e eVar6 = m0.f9201a;
                            lg.d dVar6 = lg.d.f20063c;
                            a aVar15 = new a(boardSiAcademyFragment, null, 6);
                            this.f19024c = 4;
                            obj = c0.A(dVar6, aVar15, this);
                            if (obj == aVar13) {
                                return aVar13;
                            }
                            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                            CharSequence charSequence62 = (CharSequence) obj;
                            aVar6 = (ec.a) boardSiAcademyFragment.f22459a;
                            if (aVar6 != null) {
                            }
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        CharSequence charSequence8 = (CharSequence) obj;
                        aVar4 = (ec.a) boardSiAcademyFragment.f22459a;
                        if (aVar4 != null) {
                            aVar4.f8849i.setText(charSequence8);
                        }
                        lg.e eVar7 = m0.f9201a;
                        lg.d dVar7 = lg.d.f20063c;
                        a aVar16 = new a(boardSiAcademyFragment, null, 4);
                        this.f19024c = 3;
                        obj = c0.A(dVar7, aVar16, this);
                        if (obj == aVar13) {
                            return aVar13;
                        }
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        CharSequence charSequence72 = (CharSequence) obj;
                        aVar5 = (ec.a) boardSiAcademyFragment.f22459a;
                        if (aVar5 != null) {
                        }
                        lg.e eVar62 = m0.f9201a;
                        lg.d dVar62 = lg.d.f20063c;
                        a aVar152 = new a(boardSiAcademyFragment, null, 6);
                        this.f19024c = 4;
                        obj = c0.A(dVar62, aVar152, this);
                        if (obj == aVar13) {
                        }
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        CharSequence charSequence622 = (CharSequence) obj;
                        aVar6 = (ec.a) boardSiAcademyFragment.f22459a;
                        if (aVar6 != null) {
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                CharSequence charSequence9 = (CharSequence) obj;
                ec.a aVar17 = (ec.a) boardSiAcademyFragment.f22459a;
                if (aVar17 != null) {
                    aVar17.j.setText(charSequence9);
                }
                lg.e eVar8 = m0.f9201a;
                lg.d dVar8 = lg.d.f20063c;
                a aVar18 = new a(boardSiAcademyFragment, null, 7);
                this.f19024c = 2;
                obj = c0.A(dVar8, aVar18, this);
                if (obj == aVar13) {
                    return aVar13;
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                CharSequence charSequence82 = (CharSequence) obj;
                aVar4 = (ec.a) boardSiAcademyFragment.f22459a;
                if (aVar4 != null) {
                }
                lg.e eVar72 = m0.f9201a;
                lg.d dVar72 = lg.d.f20063c;
                a aVar162 = new a(boardSiAcademyFragment, null, 4);
                this.f19024c = 3;
                obj = c0.A(dVar72, aVar162, this);
                if (obj == aVar13) {
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                CharSequence charSequence722 = (CharSequence) obj;
                aVar5 = (ec.a) boardSiAcademyFragment.f22459a;
                if (aVar5 != null) {
                }
                lg.e eVar622 = m0.f9201a;
                lg.d dVar622 = lg.d.f20063c;
                a aVar1522 = new a(boardSiAcademyFragment, null, 6);
                this.f19024c = 4;
                obj = c0.A(dVar622, aVar1522, this);
                if (obj == aVar13) {
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                CharSequence charSequence6222 = (CharSequence) obj;
                aVar6 = (ec.a) boardSiAcademyFragment.f22459a;
                if (aVar6 != null) {
                }
                return Unit.f19194a;
        }
    }
}
