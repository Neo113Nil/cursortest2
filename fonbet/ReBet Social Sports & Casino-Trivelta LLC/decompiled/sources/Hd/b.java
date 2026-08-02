package Hd;

import android.database.Cursor;
import androidx.room.A;
import androidx.room.AbstractC2268f;
import androidx.room.k;
import androidx.room.w;
import com.zoho.livechat.android.modules.brand.data.local.entities.FormEntity;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b implements Hd.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f4878a;

    /* renamed from: b, reason: collision with root package name */
    public final k f4879b;

    public class a extends k {
        public a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR REPLACE INTO `forms` (`brand_status_type`,`display_name`,`fields_pre_fill_type`,`form_type`,`messages`,`title`) VALUES (?,?,?,?,?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, FormEntity formEntity) {
            kVar.P0(1, formEntity.getBrandStatusType());
            if (formEntity.getDisplayName() == null) {
                kVar.C1(2);
            } else {
                kVar.P0(2, formEntity.getDisplayName());
            }
            if (formEntity.getFieldsPrefillType() == null) {
                kVar.C1(3);
            } else {
                kVar.P0(3, formEntity.getFieldsPrefillType());
            }
            if (formEntity.getFormType() == null) {
                kVar.C1(4);
            } else {
                kVar.P0(4, formEntity.getFormType());
            }
            if (formEntity.getMessages() == null) {
                kVar.C1(5);
            } else {
                kVar.P0(5, formEntity.getMessages());
            }
            if (formEntity.getTitle() == null) {
                kVar.C1(6);
            } else {
                kVar.P0(6, formEntity.getTitle());
            }
        }
    }

    /* renamed from: Hd.b$b, reason: collision with other inner class name */
    public class CallableC0103b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FormEntity f4881a;

        public CallableC0103b(FormEntity formEntity) {
            this.f4881a = formEntity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            b.this.f4878a.beginTransaction();
            try {
                b.this.f4879b.e(this.f4881a);
                b.this.f4878a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                b.this.f4878a.endTransaction();
            }
        }
    }

    public class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f4883a;

        public c(A a10) {
            this.f4883a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FormEntity call() {
            FormEntity formEntity = null;
            Cursor c10 = A2.b.c(b.this.f4878a, this.f4883a, false, null);
            try {
                int e10 = A2.a.e(c10, "brand_status_type");
                int e11 = A2.a.e(c10, "display_name");
                int e12 = A2.a.e(c10, "fields_pre_fill_type");
                int e13 = A2.a.e(c10, "form_type");
                int e14 = A2.a.e(c10, "messages");
                int e15 = A2.a.e(c10, "title");
                if (c10.moveToFirst()) {
                    formEntity = new FormEntity(c10.getString(e10), c10.isNull(e11) ? null : c10.getString(e11), c10.isNull(e12) ? null : c10.getString(e12), c10.isNull(e13) ? null : c10.getString(e13), c10.isNull(e14) ? null : c10.getString(e14), c10.isNull(e15) ? null : c10.getString(e15));
                }
                return formEntity;
            } finally {
                c10.close();
                this.f4883a.U();
            }
        }
    }

    public b(w wVar) {
        this.f4878a = wVar;
        this.f4879b = new a(wVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // Hd.a
    public Object a(String str, Continuation continuation) {
        A r10 = A.r("SELECT * FROM forms WHERE brand_status_type = ?", 1);
        r10.P0(1, str);
        return AbstractC2268f.b(this.f4878a, false, A2.b.a(), new c(r10), continuation);
    }

    @Override // Hd.a
    public Object b(FormEntity formEntity, Continuation continuation) {
        return AbstractC2268f.c(this.f4878a, true, new CallableC0103b(formEntity), continuation);
    }
}
