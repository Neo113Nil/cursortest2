package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype;", "Landroid/os/Parcelable;", "json", "", "accountType", "Lcom/plaid/link/result/LinkAccountType;", "(Ljava/lang/String;Lcom/plaid/link/result/LinkAccountType;)V", "getAccountType", "()Lcom/plaid/link/result/LinkAccountType;", "getJson", "()Ljava/lang/String;", "CREDIT", "Companion", "DEPOSITORY", "INVESTMENT", "LOAN_SUBTYPE", "OTHER", "UNKNOWN", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$UNKNOWN;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LinkAccountSubtype implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Map<LinkAccountType, Map<String, LinkAccountSubtype>>> accountTypeToMap$delegate = LazyKt.lazy(new Function0<Map<LinkAccountType, ? extends Map<String, ? extends LinkAccountSubtype>>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$accountTypeToMap$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<LinkAccountType, ? extends Map<String, ? extends LinkAccountSubtype>> invoke() {
            Map creditMap;
            Map depositoryMap;
            Map investmentMap;
            Map loanMap;
            LinkAccountType.CREDIT credit = LinkAccountType.CREDIT.INSTANCE;
            LinkAccountSubtype.Companion companion = LinkAccountSubtype.INSTANCE;
            creditMap = companion.getCreditMap();
            Pair pair = TuplesKt.to(credit, creditMap);
            LinkAccountType.DEPOSITORY depository = LinkAccountType.DEPOSITORY.INSTANCE;
            depositoryMap = companion.getDepositoryMap();
            Pair pair2 = TuplesKt.to(depository, depositoryMap);
            LinkAccountType.INVESTMENT investment = LinkAccountType.INVESTMENT.INSTANCE;
            investmentMap = companion.getInvestmentMap();
            Pair pair3 = TuplesKt.to(investment, investmentMap);
            LinkAccountType.LOAN loan = LinkAccountType.LOAN.INSTANCE;
            loanMap = companion.getLoanMap();
            return MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to(loan, loanMap));
        }
    });

    @NotNull
    private static final Lazy<Map<String, CREDIT>> creditMap$delegate = LazyKt.lazy(new Function0<Map<String, ? extends CREDIT>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$creditMap$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends LinkAccountSubtype.CREDIT> invoke() {
            LinkAccountSubtype.CREDIT.ALL all = LinkAccountSubtype.CREDIT.ALL.INSTANCE;
            Pair pair = TuplesKt.to(all.getJson(), all);
            LinkAccountSubtype.CREDIT.CREDIT_CARD credit_card = LinkAccountSubtype.CREDIT.CREDIT_CARD.INSTANCE;
            Pair pair2 = TuplesKt.to(credit_card.getJson(), credit_card);
            LinkAccountSubtype.CREDIT.PAYPAL_CREDIT paypal_credit = LinkAccountSubtype.CREDIT.PAYPAL_CREDIT.INSTANCE;
            return MapsKt.mapOf(pair, pair2, TuplesKt.to(paypal_credit.getJson(), paypal_credit));
        }
    });

    @NotNull
    private static final Lazy<Map<String, DEPOSITORY>> depositoryMap$delegate = LazyKt.lazy(new Function0<Map<String, ? extends DEPOSITORY>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$depositoryMap$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends LinkAccountSubtype.DEPOSITORY> invoke() {
            LinkAccountSubtype.DEPOSITORY.ALL all = LinkAccountSubtype.DEPOSITORY.ALL.INSTANCE;
            Pair pair = TuplesKt.to(all.getJson(), all);
            LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT cash_management = LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT.INSTANCE;
            Pair pair2 = TuplesKt.to(cash_management.getJson(), cash_management);
            LinkAccountSubtype.DEPOSITORY.CD cd2 = LinkAccountSubtype.DEPOSITORY.CD.INSTANCE;
            Pair pair3 = TuplesKt.to(cd2.getJson(), cd2);
            LinkAccountSubtype.DEPOSITORY.CHECKING checking = LinkAccountSubtype.DEPOSITORY.CHECKING.INSTANCE;
            Pair pair4 = TuplesKt.to(checking.getJson(), checking);
            LinkAccountSubtype.DEPOSITORY.EBT ebt = LinkAccountSubtype.DEPOSITORY.EBT.INSTANCE;
            Pair pair5 = TuplesKt.to(ebt.getJson(), ebt);
            LinkAccountSubtype.DEPOSITORY.HSA hsa = LinkAccountSubtype.DEPOSITORY.HSA.INSTANCE;
            Pair pair6 = TuplesKt.to(hsa.getJson(), hsa);
            LinkAccountSubtype.DEPOSITORY.MONEY_MARKET money_market = LinkAccountSubtype.DEPOSITORY.MONEY_MARKET.INSTANCE;
            Pair pair7 = TuplesKt.to(money_market.getJson(), money_market);
            LinkAccountSubtype.DEPOSITORY.PAYPAL paypal = LinkAccountSubtype.DEPOSITORY.PAYPAL.INSTANCE;
            Pair pair8 = TuplesKt.to(paypal.getJson(), paypal);
            LinkAccountSubtype.DEPOSITORY.PREPAID prepaid = LinkAccountSubtype.DEPOSITORY.PREPAID.INSTANCE;
            Pair pair9 = TuplesKt.to(prepaid.getJson(), prepaid);
            LinkAccountSubtype.DEPOSITORY.SAVINGS savings = LinkAccountSubtype.DEPOSITORY.SAVINGS.INSTANCE;
            return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, TuplesKt.to(savings.getJson(), savings));
        }
    });

    @NotNull
    private static final Lazy<Map<String, INVESTMENT>> investmentMap$delegate = LazyKt.lazy(new Function0<Map<String, ? extends INVESTMENT>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$investmentMap$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends LinkAccountSubtype.INVESTMENT> invoke() {
            LinkAccountSubtype.INVESTMENT.ALL all = LinkAccountSubtype.INVESTMENT.ALL.INSTANCE;
            Pair pair = TuplesKt.to(all.getJson(), all);
            LinkAccountSubtype.INVESTMENT.BROKERAGE brokerage = LinkAccountSubtype.INVESTMENT.BROKERAGE.INSTANCE;
            Pair pair2 = TuplesKt.to(brokerage.getJson(), brokerage);
            LinkAccountSubtype.INVESTMENT.CASH_ISA cash_isa = LinkAccountSubtype.INVESTMENT.CASH_ISA.INSTANCE;
            Pair pair3 = TuplesKt.to(cash_isa.getJson(), cash_isa);
            LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT education_savings_account = LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT.INSTANCE;
            Pair pair4 = TuplesKt.to(education_savings_account.getJson(), education_savings_account);
            LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY fixed_annuity = LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY.INSTANCE;
            Pair pair5 = TuplesKt.to(fixed_annuity.getJson(), fixed_annuity);
            LinkAccountSubtype.INVESTMENT.GIC gic = LinkAccountSubtype.INVESTMENT.GIC.INSTANCE;
            Pair pair6 = TuplesKt.to(gic.getJson(), gic);
            LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT health_reimbursement_arrangement = LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT.INSTANCE;
            Pair pair7 = TuplesKt.to(health_reimbursement_arrangement.getJson(), health_reimbursement_arrangement);
            LinkAccountSubtype.INVESTMENT.HSA hsa = LinkAccountSubtype.INVESTMENT.HSA.INSTANCE;
            Pair pair8 = TuplesKt.to(hsa.getJson(), hsa);
            LinkAccountSubtype.INVESTMENT.INVESTMENT_401A investment_401a = LinkAccountSubtype.INVESTMENT.INVESTMENT_401A.INSTANCE;
            Pair pair9 = TuplesKt.to(investment_401a.getJson(), investment_401a);
            LinkAccountSubtype.INVESTMENT.INVESTMENT_401K investment_401k = LinkAccountSubtype.INVESTMENT.INVESTMENT_401K.INSTANCE;
            Pair pair10 = TuplesKt.to(investment_401k.getJson(), investment_401k);
            LinkAccountSubtype.INVESTMENT.INVESTMENT_403B investment_403b = LinkAccountSubtype.INVESTMENT.INVESTMENT_403B.INSTANCE;
            Pair pair11 = TuplesKt.to(investment_403b.getJson(), investment_403b);
            LinkAccountSubtype.INVESTMENT.INVESTMENT_457B investment_457b = LinkAccountSubtype.INVESTMENT.INVESTMENT_457B.INSTANCE;
            Pair pair12 = TuplesKt.to(investment_457b.getJson(), investment_457b);
            LinkAccountSubtype.INVESTMENT.INVESTMENT_529 investment_529 = LinkAccountSubtype.INVESTMENT.INVESTMENT_529.INSTANCE;
            Pair pair13 = TuplesKt.to(investment_529.getJson(), investment_529);
            LinkAccountSubtype.INVESTMENT.IRA ira = LinkAccountSubtype.INVESTMENT.IRA.INSTANCE;
            Pair pair14 = TuplesKt.to(ira.getJson(), ira);
            LinkAccountSubtype.INVESTMENT.ISA isa = LinkAccountSubtype.INVESTMENT.ISA.INSTANCE;
            Pair pair15 = TuplesKt.to(isa.getJson(), isa);
            LinkAccountSubtype.INVESTMENT.KEOGH keogh = LinkAccountSubtype.INVESTMENT.KEOGH.INSTANCE;
            Pair pair16 = TuplesKt.to(keogh.getJson(), keogh);
            LinkAccountSubtype.INVESTMENT.LIF lif = LinkAccountSubtype.INVESTMENT.LIF.INSTANCE;
            Pair pair17 = TuplesKt.to(lif.getJson(), lif);
            LinkAccountSubtype.INVESTMENT.LIRA lira = LinkAccountSubtype.INVESTMENT.LIRA.INSTANCE;
            Pair pair18 = TuplesKt.to(lira.getJson(), lira);
            LinkAccountSubtype.INVESTMENT.LRIF lrif = LinkAccountSubtype.INVESTMENT.LRIF.INSTANCE;
            Pair pair19 = TuplesKt.to(lrif.getJson(), lrif);
            LinkAccountSubtype.INVESTMENT.LRSP lrsp = LinkAccountSubtype.INVESTMENT.LRSP.INSTANCE;
            Pair pair20 = TuplesKt.to(lrsp.getJson(), lrsp);
            LinkAccountSubtype.INVESTMENT.MUTUAL_FUND mutual_fund = LinkAccountSubtype.INVESTMENT.MUTUAL_FUND.INSTANCE;
            Pair pair21 = TuplesKt.to(mutual_fund.getJson(), mutual_fund);
            LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT non_taxable_brokerage_accountt = LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT.INSTANCE;
            Pair pair22 = TuplesKt.to(non_taxable_brokerage_accountt.getJson(), non_taxable_brokerage_accountt);
            LinkAccountSubtype.INVESTMENT.PENSION pension = LinkAccountSubtype.INVESTMENT.PENSION.INSTANCE;
            Pair pair23 = TuplesKt.to(pension.getJson(), pension);
            LinkAccountSubtype.INVESTMENT.PRIF prif = LinkAccountSubtype.INVESTMENT.PRIF.INSTANCE;
            Pair pair24 = TuplesKt.to(prif.getJson(), prif);
            LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN profit_sharing_plan = LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN.INSTANCE;
            Pair pair25 = TuplesKt.to(profit_sharing_plan.getJson(), profit_sharing_plan);
            LinkAccountSubtype.INVESTMENT.QSHR qshr = LinkAccountSubtype.INVESTMENT.QSHR.INSTANCE;
            Pair pair26 = TuplesKt.to(qshr.getJson(), qshr);
            LinkAccountSubtype.INVESTMENT.RDSP rdsp = LinkAccountSubtype.INVESTMENT.RDSP.INSTANCE;
            Pair pair27 = TuplesKt.to(rdsp.getJson(), rdsp);
            LinkAccountSubtype.INVESTMENT.RESP resp = LinkAccountSubtype.INVESTMENT.RESP.INSTANCE;
            Pair pair28 = TuplesKt.to(resp.getJson(), resp);
            LinkAccountSubtype.INVESTMENT.RETIREMENT retirement = LinkAccountSubtype.INVESTMENT.RETIREMENT.INSTANCE;
            Pair pair29 = TuplesKt.to(retirement.getJson(), retirement);
            LinkAccountSubtype.INVESTMENT.RLIF rlif = LinkAccountSubtype.INVESTMENT.RLIF.INSTANCE;
            Pair pair30 = TuplesKt.to(rlif.getJson(), rlif);
            LinkAccountSubtype.INVESTMENT.ROTH roth = LinkAccountSubtype.INVESTMENT.ROTH.INSTANCE;
            Pair pair31 = TuplesKt.to(roth.getJson(), roth);
            LinkAccountSubtype.INVESTMENT.ROTH_401K roth_401k = LinkAccountSubtype.INVESTMENT.ROTH_401K.INSTANCE;
            Pair pair32 = TuplesKt.to(roth_401k.getJson(), roth_401k);
            LinkAccountSubtype.INVESTMENT.RRIF rrif = LinkAccountSubtype.INVESTMENT.RRIF.INSTANCE;
            Pair pair33 = TuplesKt.to(rrif.getJson(), rrif);
            LinkAccountSubtype.INVESTMENT.RRSP rrsp = LinkAccountSubtype.INVESTMENT.RRSP.INSTANCE;
            Pair pair34 = TuplesKt.to(rrsp.getJson(), rrsp);
            LinkAccountSubtype.INVESTMENT.SARSEP sarsep = LinkAccountSubtype.INVESTMENT.SARSEP.INSTANCE;
            Pair pair35 = TuplesKt.to(sarsep.getJson(), sarsep);
            LinkAccountSubtype.INVESTMENT.SEP_IRA sep_ira = LinkAccountSubtype.INVESTMENT.SEP_IRA.INSTANCE;
            Pair pair36 = TuplesKt.to(sep_ira.getJson(), sep_ira);
            LinkAccountSubtype.INVESTMENT.SIMPLE_IRA simple_ira = LinkAccountSubtype.INVESTMENT.SIMPLE_IRA.INSTANCE;
            Pair pair37 = TuplesKt.to(simple_ira.getJson(), simple_ira);
            LinkAccountSubtype.INVESTMENT.SIPP sipp = LinkAccountSubtype.INVESTMENT.SIPP.INSTANCE;
            Pair pair38 = TuplesKt.to(sipp.getJson(), sipp);
            LinkAccountSubtype.INVESTMENT.STOCK_PLAN stock_plan = LinkAccountSubtype.INVESTMENT.STOCK_PLAN.INSTANCE;
            Pair pair39 = TuplesKt.to(stock_plan.getJson(), stock_plan);
            LinkAccountSubtype.INVESTMENT.TFSA tfsa = LinkAccountSubtype.INVESTMENT.TFSA.INSTANCE;
            Pair pair40 = TuplesKt.to(tfsa.getJson(), tfsa);
            LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN thrift_savings_plan = LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN.INSTANCE;
            Pair pair41 = TuplesKt.to(thrift_savings_plan.getJson(), thrift_savings_plan);
            LinkAccountSubtype.INVESTMENT.TRUST trust = LinkAccountSubtype.INVESTMENT.TRUST.INSTANCE;
            Pair pair42 = TuplesKt.to(trust.getJson(), trust);
            LinkAccountSubtype.INVESTMENT.UGMA ugma = LinkAccountSubtype.INVESTMENT.UGMA.INSTANCE;
            Pair pair43 = TuplesKt.to(ugma.getJson(), ugma);
            LinkAccountSubtype.INVESTMENT.UTMA utma = LinkAccountSubtype.INVESTMENT.UTMA.INSTANCE;
            Pair pair44 = TuplesKt.to(utma.getJson(), utma);
            LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY variable_annuity = LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY.INSTANCE;
            return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, TuplesKt.to(variable_annuity.getJson(), variable_annuity));
        }
    });

    @NotNull
    private static final Lazy<Map<String, LOAN_SUBTYPE>> loanMap$delegate = LazyKt.lazy(new Function0<Map<String, ? extends LOAN_SUBTYPE>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$loanMap$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends LinkAccountSubtype.LOAN_SUBTYPE> invoke() {
            LinkAccountSubtype.LOAN_SUBTYPE.ALL all = LinkAccountSubtype.LOAN_SUBTYPE.ALL.INSTANCE;
            Pair pair = TuplesKt.to(all.getJson(), all);
            LinkAccountSubtype.LOAN_SUBTYPE.AUTO auto = LinkAccountSubtype.LOAN_SUBTYPE.AUTO.INSTANCE;
            Pair pair2 = TuplesKt.to(auto.getJson(), auto);
            LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS business = LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS.INSTANCE;
            Pair pair3 = TuplesKt.to(business.getJson(), business);
            LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL commercial = LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL.INSTANCE;
            Pair pair4 = TuplesKt.to(commercial.getJson(), commercial);
            LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION construction = LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION.INSTANCE;
            Pair pair5 = TuplesKt.to(construction.getJson(), construction);
            LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER consumer = LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER.INSTANCE;
            Pair pair6 = TuplesKt.to(consumer.getJson(), consumer);
            LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY home_equity = LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY.INSTANCE;
            Pair pair7 = TuplesKt.to(home_equity.getJson(), home_equity);
            LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT line_of_credit = LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT.INSTANCE;
            Pair pair8 = TuplesKt.to(line_of_credit.getJson(), line_of_credit);
            LinkAccountSubtype.LOAN_SUBTYPE.LOAN loan = LinkAccountSubtype.LOAN_SUBTYPE.LOAN.INSTANCE;
            Pair pair9 = TuplesKt.to(loan.getJson(), loan);
            LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE mortgage = LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE.INSTANCE;
            Pair pair10 = TuplesKt.to(mortgage.getJson(), mortgage);
            LinkAccountSubtype.LOAN_SUBTYPE.OTHER other = LinkAccountSubtype.LOAN_SUBTYPE.OTHER.INSTANCE;
            Pair pair11 = TuplesKt.to(other.getJson(), other);
            LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT overdraft = LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT.INSTANCE;
            Pair pair12 = TuplesKt.to(overdraft.getJson(), overdraft);
            LinkAccountSubtype.LOAN_SUBTYPE.STUDENT student = LinkAccountSubtype.LOAN_SUBTYPE.STUDENT.INSTANCE;
            return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, TuplesKt.to(student.getJson(), student));
        }
    });

    @NotNull
    private final LinkAccountType accountType;

    @NotNull
    private final String json;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "ALL", "CREDIT_CARD", "PAYPAL_CREDIT", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$CREDIT_CARD;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$PAYPAL_CREDIT;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CREDIT extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends CREDIT {

            @NotNull
            public static final ALL INSTANCE = new ALL();

            @NotNull
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ALL createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ALL[] newArray(int i10) {
                    return new ALL[i10];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$CREDIT_CARD;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CREDIT_CARD extends CREDIT {

            @NotNull
            public static final CREDIT_CARD INSTANCE = new CREDIT_CARD();

            @NotNull
            public static final Parcelable.Creator<CREDIT_CARD> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CREDIT_CARD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CREDIT_CARD createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CREDIT_CARD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CREDIT_CARD[] newArray(int i10) {
                    return new CREDIT_CARD[i10];
                }
            }

            private CREDIT_CARD() {
                super("credit card", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$PAYPAL_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYPAL_CREDIT extends CREDIT {

            @NotNull
            public static final PAYPAL_CREDIT INSTANCE = new PAYPAL_CREDIT();

            @NotNull
            public static final Parcelable.Creator<PAYPAL_CREDIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYPAL_CREDIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYPAL_CREDIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PAYPAL_CREDIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYPAL_CREDIT[] newArray(int i10) {
                    return new PAYPAL_CREDIT[i10];
                }
            }

            private PAYPAL_CREDIT() {
                super("paypal", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ CREDIT(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private CREDIT(String str) {
            super(str, LinkAccountType.CREDIT.INSTANCE, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006R3\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR'\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\tR'\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0016\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$Companion;", "", "()V", "accountTypeToMap", "", "Lcom/plaid/link/result/LinkAccountType;", "", "Lcom/plaid/link/result/LinkAccountSubtype;", "getAccountTypeToMap", "()Ljava/util/Map;", "accountTypeToMap$delegate", "Lkotlin/Lazy;", "creditMap", "getCreditMap", "creditMap$delegate", "depositoryMap", "getDepositoryMap", "depositoryMap$delegate", "investmentMap", "getInvestmentMap", "investmentMap$delegate", "loanMap", "getLoanMap", "loanMap$delegate", "convert", "subtypeJson", "accountTypeJson", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<LinkAccountType, Map<String, LinkAccountSubtype>> getAccountTypeToMap() {
            return (Map) LinkAccountSubtype.accountTypeToMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getCreditMap() {
            return (Map) LinkAccountSubtype.creditMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getDepositoryMap() {
            return (Map) LinkAccountSubtype.depositoryMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getInvestmentMap() {
            return (Map) LinkAccountSubtype.investmentMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getLoanMap() {
            return (Map) LinkAccountSubtype.loanMap$delegate.getValue();
        }

        @NotNull
        public final LinkAccountSubtype convert(@Nullable String subtypeJson, @Nullable String accountTypeJson) {
            LinkAccountSubtype linkAccountSubtype;
            LinkAccountType.Companion companion = LinkAccountType.INSTANCE;
            if (accountTypeJson == null) {
                accountTypeJson = "";
            }
            LinkAccountType convert = companion.convert(accountTypeJson);
            if (Intrinsics.areEqual(convert, LinkAccountType.OTHER.INSTANCE)) {
                return OTHER.C0590OTHER.INSTANCE;
            }
            Map<String, LinkAccountSubtype> map = getAccountTypeToMap().get(convert);
            if (map != null && (linkAccountSubtype = map.get(subtypeJson)) != null) {
                return linkAccountSubtype;
            }
            if (subtypeJson == null) {
                subtypeJson = "";
            }
            return new UNKNOWN(subtypeJson, convert);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "ALL", "CASH_MANAGEMENT", "CD", "CHECKING", "EBT", "HSA", "MONEY_MARKET", "PAYPAL", "PREPAID", "SAVINGS", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CASH_MANAGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CD;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CHECKING;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$EBT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$MONEY_MARKET;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PAYPAL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PREPAID;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$SAVINGS;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DEPOSITORY extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends DEPOSITORY {

            @NotNull
            public static final ALL INSTANCE = new ALL();

            @NotNull
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ALL createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ALL[] newArray(int i10) {
                    return new ALL[i10];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CASH_MANAGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CASH_MANAGEMENT extends DEPOSITORY {

            @NotNull
            public static final CASH_MANAGEMENT INSTANCE = new CASH_MANAGEMENT();

            @NotNull
            public static final Parcelable.Creator<CASH_MANAGEMENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CASH_MANAGEMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CASH_MANAGEMENT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CASH_MANAGEMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CASH_MANAGEMENT[] newArray(int i10) {
                    return new CASH_MANAGEMENT[i10];
                }
            }

            private CASH_MANAGEMENT() {
                super("cash management", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CD;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CD extends DEPOSITORY {

            @NotNull
            public static final CD INSTANCE = new CD();

            @NotNull
            public static final Parcelable.Creator<CD> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CD createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CD[] newArray(int i10) {
                    return new CD[i10];
                }
            }

            private CD() {
                super("cd", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CHECKING;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CHECKING extends DEPOSITORY {

            @NotNull
            public static final CHECKING INSTANCE = new CHECKING();

            @NotNull
            public static final Parcelable.Creator<CHECKING> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CHECKING> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CHECKING createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CHECKING.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CHECKING[] newArray(int i10) {
                    return new CHECKING[i10];
                }
            }

            private CHECKING() {
                super("checking", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$EBT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EBT extends DEPOSITORY {

            @NotNull
            public static final EBT INSTANCE = new EBT();

            @NotNull
            public static final Parcelable.Creator<EBT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EBT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final EBT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return EBT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final EBT[] newArray(int i10) {
                    return new EBT[i10];
                }
            }

            private EBT() {
                super("ebt", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HSA extends DEPOSITORY {

            @NotNull
            public static final HSA INSTANCE = new HSA();

            @NotNull
            public static final Parcelable.Creator<HSA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final HSA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return HSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final HSA[] newArray(int i10) {
                    return new HSA[i10];
                }
            }

            private HSA() {
                super("hsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$MONEY_MARKET;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MONEY_MARKET extends DEPOSITORY {

            @NotNull
            public static final MONEY_MARKET INSTANCE = new MONEY_MARKET();

            @NotNull
            public static final Parcelable.Creator<MONEY_MARKET> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MONEY_MARKET> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MONEY_MARKET createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MONEY_MARKET.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MONEY_MARKET[] newArray(int i10) {
                    return new MONEY_MARKET[i10];
                }
            }

            private MONEY_MARKET() {
                super("money market", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PAYPAL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYPAL extends DEPOSITORY {

            @NotNull
            public static final PAYPAL INSTANCE = new PAYPAL();

            @NotNull
            public static final Parcelable.Creator<PAYPAL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYPAL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYPAL createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PAYPAL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PAYPAL[] newArray(int i10) {
                    return new PAYPAL[i10];
                }
            }

            private PAYPAL() {
                super("paypal", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PREPAID;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PREPAID extends DEPOSITORY {

            @NotNull
            public static final PREPAID INSTANCE = new PREPAID();

            @NotNull
            public static final Parcelable.Creator<PREPAID> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PREPAID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PREPAID createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PREPAID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PREPAID[] newArray(int i10) {
                    return new PREPAID[i10];
                }
            }

            private PREPAID() {
                super("prepaid", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$SAVINGS;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SAVINGS extends DEPOSITORY {

            @NotNull
            public static final SAVINGS INSTANCE = new SAVINGS();

            @NotNull
            public static final Parcelable.Creator<SAVINGS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SAVINGS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SAVINGS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SAVINGS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SAVINGS[] newArray(int i10) {
                    return new SAVINGS[i10];
                }
            }

            private SAVINGS() {
                super("savings", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ DEPOSITORY(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private DEPOSITORY(String str) {
            super(str, LinkAccountType.DEPOSITORY.INSTANCE, null);
        }
    }

    @Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:.\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001.3456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`¨\u0006a"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "ALL", "BROKERAGE", "CASH_ISA", "EDUCATION_SAVINGS_ACCOUNT", "FIXED_ANNUITY", "GIC", "HEALTH_REIMBURSEMENT_ARRANGEMENT", "HSA", "INVESTMENT_401A", "INVESTMENT_401K", "INVESTMENT_403B", "INVESTMENT_457B", "INVESTMENT_529", "IRA", "ISA", "KEOGH", "LIF", "LIRA", "LRIF", "LRSP", "MUTUAL_FUND", "NON_TAXABLE_BROKERAGE_ACCOUNTT", "OTHER", "PENSION", "PRIF", "PROFIT_SHARING_PLAN", "QSHR", "RDSP", "RESP", "RETIREMENT", "RLIF", "ROTH", "ROTH_401K", "RRIF", "RRSP", "SARSEP", "SEP_IRA", "SIMPLE_IRA", "SIPP", "STOCK_PLAN", "TFSA", "THRIFT_SAVINGS_PLAN", "TRUST", "UGMA", "UTMA", "VARIABLE_ANNUITY", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$BROKERAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$CASH_ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$EDUCATION_SAVINGS_ACCOUNT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$FIXED_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$GIC;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HEALTH_REIMBURSEMENT_ARRANGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401A;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_403B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_457B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_529;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$KEOGH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$MUTUAL_FUND;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$NON_TAXABLE_BROKERAGE_ACCOUNTT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PENSION;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PROFIT_SHARING_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$QSHR;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RDSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RESP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RETIREMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RLIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SARSEP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SEP_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIMPLE_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIPP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$STOCK_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TFSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$THRIFT_SAVINGS_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TRUST;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UGMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UTMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$VARIABLE_ANNUITY;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class INVESTMENT extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends INVESTMENT {

            @NotNull
            public static final ALL INSTANCE = new ALL();

            @NotNull
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ALL createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ALL[] newArray(int i10) {
                    return new ALL[i10];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$BROKERAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BROKERAGE extends INVESTMENT {

            @NotNull
            public static final BROKERAGE INSTANCE = new BROKERAGE();

            @NotNull
            public static final Parcelable.Creator<BROKERAGE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BROKERAGE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BROKERAGE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BROKERAGE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BROKERAGE[] newArray(int i10) {
                    return new BROKERAGE[i10];
                }
            }

            private BROKERAGE() {
                super("brokerage", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$CASH_ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CASH_ISA extends INVESTMENT {

            @NotNull
            public static final CASH_ISA INSTANCE = new CASH_ISA();

            @NotNull
            public static final Parcelable.Creator<CASH_ISA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CASH_ISA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CASH_ISA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CASH_ISA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CASH_ISA[] newArray(int i10) {
                    return new CASH_ISA[i10];
                }
            }

            private CASH_ISA() {
                super("cash isa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$EDUCATION_SAVINGS_ACCOUNT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EDUCATION_SAVINGS_ACCOUNT extends INVESTMENT {

            @NotNull
            public static final EDUCATION_SAVINGS_ACCOUNT INSTANCE = new EDUCATION_SAVINGS_ACCOUNT();

            @NotNull
            public static final Parcelable.Creator<EDUCATION_SAVINGS_ACCOUNT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EDUCATION_SAVINGS_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final EDUCATION_SAVINGS_ACCOUNT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return EDUCATION_SAVINGS_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final EDUCATION_SAVINGS_ACCOUNT[] newArray(int i10) {
                    return new EDUCATION_SAVINGS_ACCOUNT[i10];
                }
            }

            private EDUCATION_SAVINGS_ACCOUNT() {
                super("education savings account", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$FIXED_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FIXED_ANNUITY extends INVESTMENT {

            @NotNull
            public static final FIXED_ANNUITY INSTANCE = new FIXED_ANNUITY();

            @NotNull
            public static final Parcelable.Creator<FIXED_ANNUITY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FIXED_ANNUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final FIXED_ANNUITY createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FIXED_ANNUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final FIXED_ANNUITY[] newArray(int i10) {
                    return new FIXED_ANNUITY[i10];
                }
            }

            private FIXED_ANNUITY() {
                super("fixed annuity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$GIC;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class GIC extends INVESTMENT {

            @NotNull
            public static final GIC INSTANCE = new GIC();

            @NotNull
            public static final Parcelable.Creator<GIC> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<GIC> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final GIC createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return GIC.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final GIC[] newArray(int i10) {
                    return new GIC[i10];
                }
            }

            private GIC() {
                super("gic", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HEALTH_REIMBURSEMENT_ARRANGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HEALTH_REIMBURSEMENT_ARRANGEMENT extends INVESTMENT {

            @NotNull
            public static final HEALTH_REIMBURSEMENT_ARRANGEMENT INSTANCE = new HEALTH_REIMBURSEMENT_ARRANGEMENT();

            @NotNull
            public static final Parcelable.Creator<HEALTH_REIMBURSEMENT_ARRANGEMENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HEALTH_REIMBURSEMENT_ARRANGEMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final HEALTH_REIMBURSEMENT_ARRANGEMENT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return HEALTH_REIMBURSEMENT_ARRANGEMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final HEALTH_REIMBURSEMENT_ARRANGEMENT[] newArray(int i10) {
                    return new HEALTH_REIMBURSEMENT_ARRANGEMENT[i10];
                }
            }

            private HEALTH_REIMBURSEMENT_ARRANGEMENT() {
                super("health reimbursement arrangement", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HSA extends INVESTMENT {

            @NotNull
            public static final HSA INSTANCE = new HSA();

            @NotNull
            public static final Parcelable.Creator<HSA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final HSA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return HSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final HSA[] newArray(int i10) {
                    return new HSA[i10];
                }
            }

            private HSA() {
                super("hsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401A;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_401A extends INVESTMENT {

            @NotNull
            public static final INVESTMENT_401A INSTANCE = new INVESTMENT_401A();

            @NotNull
            public static final Parcelable.Creator<INVESTMENT_401A> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_401A> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_401A createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_401A.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_401A[] newArray(int i10) {
                    return new INVESTMENT_401A[i10];
                }
            }

            private INVESTMENT_401A() {
                super("401a", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_401K extends INVESTMENT {

            @NotNull
            public static final INVESTMENT_401K INSTANCE = new INVESTMENT_401K();

            @NotNull
            public static final Parcelable.Creator<INVESTMENT_401K> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_401K> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_401K createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_401K.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_401K[] newArray(int i10) {
                    return new INVESTMENT_401K[i10];
                }
            }

            private INVESTMENT_401K() {
                super("401k", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_403B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_403B extends INVESTMENT {

            @NotNull
            public static final INVESTMENT_403B INSTANCE = new INVESTMENT_403B();

            @NotNull
            public static final Parcelable.Creator<INVESTMENT_403B> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_403B> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_403B createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_403B.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_403B[] newArray(int i10) {
                    return new INVESTMENT_403B[i10];
                }
            }

            private INVESTMENT_403B() {
                super("403B", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_457B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_457B extends INVESTMENT {

            @NotNull
            public static final INVESTMENT_457B INSTANCE = new INVESTMENT_457B();

            @NotNull
            public static final Parcelable.Creator<INVESTMENT_457B> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_457B> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_457B createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_457B.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_457B[] newArray(int i10) {
                    return new INVESTMENT_457B[i10];
                }
            }

            private INVESTMENT_457B() {
                super("457b", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_529;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_529 extends INVESTMENT {

            @NotNull
            public static final INVESTMENT_529 INSTANCE = new INVESTMENT_529();

            @NotNull
            public static final Parcelable.Creator<INVESTMENT_529> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_529> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_529 createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_529.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final INVESTMENT_529[] newArray(int i10) {
                    return new INVESTMENT_529[i10];
                }
            }

            private INVESTMENT_529() {
                super("529", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IRA extends INVESTMENT {

            @NotNull
            public static final IRA INSTANCE = new IRA();

            @NotNull
            public static final Parcelable.Creator<IRA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final IRA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final IRA[] newArray(int i10) {
                    return new IRA[i10];
                }
            }

            private IRA() {
                super("ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ISA extends INVESTMENT {

            @NotNull
            public static final ISA INSTANCE = new ISA();

            @NotNull
            public static final Parcelable.Creator<ISA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ISA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ISA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ISA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ISA[] newArray(int i10) {
                    return new ISA[i10];
                }
            }

            private ISA() {
                super("isa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$KEOGH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class KEOGH extends INVESTMENT {

            @NotNull
            public static final KEOGH INSTANCE = new KEOGH();

            @NotNull
            public static final Parcelable.Creator<KEOGH> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<KEOGH> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final KEOGH createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return KEOGH.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final KEOGH[] newArray(int i10) {
                    return new KEOGH[i10];
                }
            }

            private KEOGH() {
                super("keogh", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LIF extends INVESTMENT {

            @NotNull
            public static final LIF INSTANCE = new LIF();

            @NotNull
            public static final Parcelable.Creator<LIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LIF createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LIF[] newArray(int i10) {
                    return new LIF[i10];
                }
            }

            private LIF() {
                super("lif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LIRA extends INVESTMENT {

            @NotNull
            public static final LIRA INSTANCE = new LIRA();

            @NotNull
            public static final Parcelable.Creator<LIRA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LIRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LIRA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LIRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LIRA[] newArray(int i10) {
                    return new LIRA[i10];
                }
            }

            private LIRA() {
                super("lira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LRIF extends INVESTMENT {

            @NotNull
            public static final LRIF INSTANCE = new LRIF();

            @NotNull
            public static final Parcelable.Creator<LRIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LRIF createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LRIF[] newArray(int i10) {
                    return new LRIF[i10];
                }
            }

            private LRIF() {
                super("lrif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LRSP extends INVESTMENT {

            @NotNull
            public static final LRSP INSTANCE = new LRSP();

            @NotNull
            public static final Parcelable.Creator<LRSP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LRSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LRSP createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LRSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LRSP[] newArray(int i10) {
                    return new LRSP[i10];
                }
            }

            private LRSP() {
                super("lrsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$MUTUAL_FUND;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MUTUAL_FUND extends INVESTMENT {

            @NotNull
            public static final MUTUAL_FUND INSTANCE = new MUTUAL_FUND();

            @NotNull
            public static final Parcelable.Creator<MUTUAL_FUND> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MUTUAL_FUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MUTUAL_FUND createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MUTUAL_FUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MUTUAL_FUND[] newArray(int i10) {
                    return new MUTUAL_FUND[i10];
                }
            }

            private MUTUAL_FUND() {
                super("mutual fund", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$NON_TAXABLE_BROKERAGE_ACCOUNTT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NON_TAXABLE_BROKERAGE_ACCOUNTT extends INVESTMENT {

            @NotNull
            public static final NON_TAXABLE_BROKERAGE_ACCOUNTT INSTANCE = new NON_TAXABLE_BROKERAGE_ACCOUNTT();

            @NotNull
            public static final Parcelable.Creator<NON_TAXABLE_BROKERAGE_ACCOUNTT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NON_TAXABLE_BROKERAGE_ACCOUNTT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NON_TAXABLE_BROKERAGE_ACCOUNTT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NON_TAXABLE_BROKERAGE_ACCOUNTT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NON_TAXABLE_BROKERAGE_ACCOUNTT[] newArray(int i10) {
                    return new NON_TAXABLE_BROKERAGE_ACCOUNTT[i10];
                }
            }

            private NON_TAXABLE_BROKERAGE_ACCOUNTT() {
                super("non-taxable brokerage account", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OTHER extends INVESTMENT {

            @NotNull
            public static final OTHER INSTANCE = new OTHER();

            @NotNull
            public static final Parcelable.Creator<OTHER> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OTHER createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OTHER[] newArray(int i10) {
                    return new OTHER[i10];
                }
            }

            private OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PENSION;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PENSION extends INVESTMENT {

            @NotNull
            public static final PENSION INSTANCE = new PENSION();

            @NotNull
            public static final Parcelable.Creator<PENSION> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PENSION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PENSION createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PENSION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PENSION[] newArray(int i10) {
                    return new PENSION[i10];
                }
            }

            private PENSION() {
                super("pension", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRIF extends INVESTMENT {

            @NotNull
            public static final PRIF INSTANCE = new PRIF();

            @NotNull
            public static final Parcelable.Creator<PRIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRIF createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PRIF[] newArray(int i10) {
                    return new PRIF[i10];
                }
            }

            private PRIF() {
                super("prif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PROFIT_SHARING_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PROFIT_SHARING_PLAN extends INVESTMENT {

            @NotNull
            public static final PROFIT_SHARING_PLAN INSTANCE = new PROFIT_SHARING_PLAN();

            @NotNull
            public static final Parcelable.Creator<PROFIT_SHARING_PLAN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PROFIT_SHARING_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PROFIT_SHARING_PLAN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PROFIT_SHARING_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final PROFIT_SHARING_PLAN[] newArray(int i10) {
                    return new PROFIT_SHARING_PLAN[i10];
                }
            }

            private PROFIT_SHARING_PLAN() {
                super("profit sharing plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$QSHR;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class QSHR extends INVESTMENT {

            @NotNull
            public static final QSHR INSTANCE = new QSHR();

            @NotNull
            public static final Parcelable.Creator<QSHR> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<QSHR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final QSHR createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return QSHR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final QSHR[] newArray(int i10) {
                    return new QSHR[i10];
                }
            }

            private QSHR() {
                super("qshr", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RDSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RDSP extends INVESTMENT {

            @NotNull
            public static final RDSP INSTANCE = new RDSP();

            @NotNull
            public static final Parcelable.Creator<RDSP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RDSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RDSP createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RDSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RDSP[] newArray(int i10) {
                    return new RDSP[i10];
                }
            }

            private RDSP() {
                super("rdsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RESP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RESP extends INVESTMENT {

            @NotNull
            public static final RESP INSTANCE = new RESP();

            @NotNull
            public static final Parcelable.Creator<RESP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RESP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RESP createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RESP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RESP[] newArray(int i10) {
                    return new RESP[i10];
                }
            }

            private RESP() {
                super("resp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RETIREMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RETIREMENT extends INVESTMENT {

            @NotNull
            public static final RETIREMENT INSTANCE = new RETIREMENT();

            @NotNull
            public static final Parcelable.Creator<RETIREMENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RETIREMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RETIREMENT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RETIREMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RETIREMENT[] newArray(int i10) {
                    return new RETIREMENT[i10];
                }
            }

            private RETIREMENT() {
                super("retirement", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RLIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RLIF extends INVESTMENT {

            @NotNull
            public static final RLIF INSTANCE = new RLIF();

            @NotNull
            public static final Parcelable.Creator<RLIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RLIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RLIF createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RLIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RLIF[] newArray(int i10) {
                    return new RLIF[i10];
                }
            }

            private RLIF() {
                super("rlif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ROTH extends INVESTMENT {

            @NotNull
            public static final ROTH INSTANCE = new ROTH();

            @NotNull
            public static final Parcelable.Creator<ROTH> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ROTH> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ROTH createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ROTH.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ROTH[] newArray(int i10) {
                    return new ROTH[i10];
                }
            }

            private ROTH() {
                super("roth", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ROTH_401K extends INVESTMENT {

            @NotNull
            public static final ROTH_401K INSTANCE = new ROTH_401K();

            @NotNull
            public static final Parcelable.Creator<ROTH_401K> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ROTH_401K> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ROTH_401K createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ROTH_401K.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ROTH_401K[] newArray(int i10) {
                    return new ROTH_401K[i10];
                }
            }

            private ROTH_401K() {
                super("roth 401k", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RRIF extends INVESTMENT {

            @NotNull
            public static final RRIF INSTANCE = new RRIF();

            @NotNull
            public static final Parcelable.Creator<RRIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RRIF createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RRIF[] newArray(int i10) {
                    return new RRIF[i10];
                }
            }

            private RRIF() {
                super("rrif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RRSP extends INVESTMENT {

            @NotNull
            public static final RRSP INSTANCE = new RRSP();

            @NotNull
            public static final Parcelable.Creator<RRSP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RRSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RRSP createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RRSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RRSP[] newArray(int i10) {
                    return new RRSP[i10];
                }
            }

            private RRSP() {
                super("rrsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SARSEP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SARSEP extends INVESTMENT {

            @NotNull
            public static final SARSEP INSTANCE = new SARSEP();

            @NotNull
            public static final Parcelable.Creator<SARSEP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SARSEP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SARSEP createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SARSEP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SARSEP[] newArray(int i10) {
                    return new SARSEP[i10];
                }
            }

            private SARSEP() {
                super("sarsep", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SEP_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SEP_IRA extends INVESTMENT {

            @NotNull
            public static final SEP_IRA INSTANCE = new SEP_IRA();

            @NotNull
            public static final Parcelable.Creator<SEP_IRA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SEP_IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SEP_IRA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SEP_IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SEP_IRA[] newArray(int i10) {
                    return new SEP_IRA[i10];
                }
            }

            private SEP_IRA() {
                super("sep ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIMPLE_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SIMPLE_IRA extends INVESTMENT {

            @NotNull
            public static final SIMPLE_IRA INSTANCE = new SIMPLE_IRA();

            @NotNull
            public static final Parcelable.Creator<SIMPLE_IRA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SIMPLE_IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SIMPLE_IRA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SIMPLE_IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SIMPLE_IRA[] newArray(int i10) {
                    return new SIMPLE_IRA[i10];
                }
            }

            private SIMPLE_IRA() {
                super("simple ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIPP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SIPP extends INVESTMENT {

            @NotNull
            public static final SIPP INSTANCE = new SIPP();

            @NotNull
            public static final Parcelable.Creator<SIPP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SIPP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SIPP createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SIPP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SIPP[] newArray(int i10) {
                    return new SIPP[i10];
                }
            }

            private SIPP() {
                super("sipp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$STOCK_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class STOCK_PLAN extends INVESTMENT {

            @NotNull
            public static final STOCK_PLAN INSTANCE = new STOCK_PLAN();

            @NotNull
            public static final Parcelable.Creator<STOCK_PLAN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<STOCK_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final STOCK_PLAN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return STOCK_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final STOCK_PLAN[] newArray(int i10) {
                    return new STOCK_PLAN[i10];
                }
            }

            private STOCK_PLAN() {
                super("stock plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TFSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TFSA extends INVESTMENT {

            @NotNull
            public static final TFSA INSTANCE = new TFSA();

            @NotNull
            public static final Parcelable.Creator<TFSA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TFSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TFSA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TFSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TFSA[] newArray(int i10) {
                    return new TFSA[i10];
                }
            }

            private TFSA() {
                super("tfsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$THRIFT_SAVINGS_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class THRIFT_SAVINGS_PLAN extends INVESTMENT {

            @NotNull
            public static final THRIFT_SAVINGS_PLAN INSTANCE = new THRIFT_SAVINGS_PLAN();

            @NotNull
            public static final Parcelable.Creator<THRIFT_SAVINGS_PLAN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<THRIFT_SAVINGS_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final THRIFT_SAVINGS_PLAN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return THRIFT_SAVINGS_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final THRIFT_SAVINGS_PLAN[] newArray(int i10) {
                    return new THRIFT_SAVINGS_PLAN[i10];
                }
            }

            private THRIFT_SAVINGS_PLAN() {
                super("thrift savings plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TRUST;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TRUST extends INVESTMENT {

            @NotNull
            public static final TRUST INSTANCE = new TRUST();

            @NotNull
            public static final Parcelable.Creator<TRUST> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TRUST> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TRUST createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TRUST.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TRUST[] newArray(int i10) {
                    return new TRUST[i10];
                }
            }

            private TRUST() {
                super("trust", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UGMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UGMA extends INVESTMENT {

            @NotNull
            public static final UGMA INSTANCE = new UGMA();

            @NotNull
            public static final Parcelable.Creator<UGMA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UGMA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UGMA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UGMA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UGMA[] newArray(int i10) {
                    return new UGMA[i10];
                }
            }

            private UGMA() {
                super("ugma", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UTMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UTMA extends INVESTMENT {

            @NotNull
            public static final UTMA INSTANCE = new UTMA();

            @NotNull
            public static final Parcelable.Creator<UTMA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UTMA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UTMA createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UTMA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final UTMA[] newArray(int i10) {
                    return new UTMA[i10];
                }
            }

            private UTMA() {
                super("utma", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$VARIABLE_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class VARIABLE_ANNUITY extends INVESTMENT {

            @NotNull
            public static final VARIABLE_ANNUITY INSTANCE = new VARIABLE_ANNUITY();

            @NotNull
            public static final Parcelable.Creator<VARIABLE_ANNUITY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<VARIABLE_ANNUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final VARIABLE_ANNUITY createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return VARIABLE_ANNUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final VARIABLE_ANNUITY[] newArray(int i10) {
                    return new VARIABLE_ANNUITY[i10];
                }
            }

            private VARIABLE_ANNUITY() {
                super("variable annuity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ INVESTMENT(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private INVESTMENT(String str) {
            super(str, LinkAccountType.INVESTMENT.INSTANCE, null);
        }

        public /* synthetic */ INVESTMENT(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\r\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "ALL", "AUTO", "BUSINESS", "COMMERCIAL", "CONSTRUCTION", "CONSUMER", "HOME_EQUITY", "LINE_OF_CREDIT", "LOAN", "MORTGAGE", "OTHER", "OVERDRAFT", "STUDENT", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$AUTO;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$BUSINESS;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$COMMERCIAL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSTRUCTION;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSUMER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$HOME_EQUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LINE_OF_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LOAN;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$MORTGAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OVERDRAFT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$STUDENT;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class LOAN_SUBTYPE extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends LOAN_SUBTYPE {

            @NotNull
            public static final ALL INSTANCE = new ALL();

            @NotNull
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ALL createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ALL[] newArray(int i10) {
                    return new ALL[i10];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$AUTO;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AUTO extends LOAN_SUBTYPE {

            @NotNull
            public static final AUTO INSTANCE = new AUTO();

            @NotNull
            public static final Parcelable.Creator<AUTO> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AUTO> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final AUTO createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AUTO.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final AUTO[] newArray(int i10) {
                    return new AUTO[i10];
                }
            }

            private AUTO() {
                super("auto", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$BUSINESS;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BUSINESS extends LOAN_SUBTYPE {

            @NotNull
            public static final BUSINESS INSTANCE = new BUSINESS();

            @NotNull
            public static final Parcelable.Creator<BUSINESS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BUSINESS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BUSINESS createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BUSINESS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BUSINESS[] newArray(int i10) {
                    return new BUSINESS[i10];
                }
            }

            private BUSINESS() {
                super("business", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$COMMERCIAL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class COMMERCIAL extends LOAN_SUBTYPE {

            @NotNull
            public static final COMMERCIAL INSTANCE = new COMMERCIAL();

            @NotNull
            public static final Parcelable.Creator<COMMERCIAL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<COMMERCIAL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final COMMERCIAL createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return COMMERCIAL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final COMMERCIAL[] newArray(int i10) {
                    return new COMMERCIAL[i10];
                }
            }

            private COMMERCIAL() {
                super("commercial", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSTRUCTION;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CONSTRUCTION extends LOAN_SUBTYPE {

            @NotNull
            public static final CONSTRUCTION INSTANCE = new CONSTRUCTION();

            @NotNull
            public static final Parcelable.Creator<CONSTRUCTION> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CONSTRUCTION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CONSTRUCTION createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CONSTRUCTION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CONSTRUCTION[] newArray(int i10) {
                    return new CONSTRUCTION[i10];
                }
            }

            private CONSTRUCTION() {
                super("construction", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSUMER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CONSUMER extends LOAN_SUBTYPE {

            @NotNull
            public static final CONSUMER INSTANCE = new CONSUMER();

            @NotNull
            public static final Parcelable.Creator<CONSUMER> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CONSUMER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CONSUMER createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CONSUMER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CONSUMER[] newArray(int i10) {
                    return new CONSUMER[i10];
                }
            }

            private CONSUMER() {
                super("consumer", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$HOME_EQUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HOME_EQUITY extends LOAN_SUBTYPE {

            @NotNull
            public static final HOME_EQUITY INSTANCE = new HOME_EQUITY();

            @NotNull
            public static final Parcelable.Creator<HOME_EQUITY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HOME_EQUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final HOME_EQUITY createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return HOME_EQUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final HOME_EQUITY[] newArray(int i10) {
                    return new HOME_EQUITY[i10];
                }
            }

            private HOME_EQUITY() {
                super("home equity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LINE_OF_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LINE_OF_CREDIT extends LOAN_SUBTYPE {

            @NotNull
            public static final LINE_OF_CREDIT INSTANCE = new LINE_OF_CREDIT();

            @NotNull
            public static final Parcelable.Creator<LINE_OF_CREDIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LINE_OF_CREDIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LINE_OF_CREDIT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LINE_OF_CREDIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LINE_OF_CREDIT[] newArray(int i10) {
                    return new LINE_OF_CREDIT[i10];
                }
            }

            private LINE_OF_CREDIT() {
                super("line of credit", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LOAN;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LOAN extends LOAN_SUBTYPE {

            @NotNull
            public static final LOAN INSTANCE = new LOAN();

            @NotNull
            public static final Parcelable.Creator<LOAN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LOAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LOAN createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LOAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LOAN[] newArray(int i10) {
                    return new LOAN[i10];
                }
            }

            private LOAN() {
                super("loan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$MORTGAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MORTGAGE extends LOAN_SUBTYPE {

            @NotNull
            public static final MORTGAGE INSTANCE = new MORTGAGE();

            @NotNull
            public static final Parcelable.Creator<MORTGAGE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MORTGAGE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MORTGAGE createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MORTGAGE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final MORTGAGE[] newArray(int i10) {
                    return new MORTGAGE[i10];
                }
            }

            private MORTGAGE() {
                super("mortgage", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OTHER extends LOAN_SUBTYPE {

            @NotNull
            public static final OTHER INSTANCE = new OTHER();

            @NotNull
            public static final Parcelable.Creator<OTHER> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OTHER createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OTHER[] newArray(int i10) {
                    return new OTHER[i10];
                }
            }

            private OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OVERDRAFT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OVERDRAFT extends LOAN_SUBTYPE {

            @NotNull
            public static final OVERDRAFT INSTANCE = new OVERDRAFT();

            @NotNull
            public static final Parcelable.Creator<OVERDRAFT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OVERDRAFT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OVERDRAFT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OVERDRAFT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OVERDRAFT[] newArray(int i10) {
                    return new OVERDRAFT[i10];
                }
            }

            private OVERDRAFT() {
                super("overdraft", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$STUDENT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class STUDENT extends LOAN_SUBTYPE {

            @NotNull
            public static final STUDENT INSTANCE = new STUDENT();

            @NotNull
            public static final Parcelable.Creator<STUDENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<STUDENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final STUDENT createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return STUDENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final STUDENT[] newArray(int i10) {
                    return new STUDENT[i10];
                }
            }

            private STUDENT() {
                super("student", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ LOAN_SUBTYPE(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private LOAN_SUBTYPE(String str) {
            super(str, LinkAccountType.LOAN.INSTANCE, null);
        }

        public /* synthetic */ LOAN_SUBTYPE(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "OTHER", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER$OTHER;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class OTHER extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$OTHER$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.plaid.link.result.LinkAccountSubtype$OTHER$OTHER, reason: collision with other inner class name */
        public static final class C0590OTHER extends OTHER {

            @NotNull
            public static final C0590OTHER INSTANCE = new C0590OTHER();

            @NotNull
            public static final Parcelable.Creator<C0590OTHER> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.plaid.link.result.LinkAccountSubtype$OTHER$OTHER$Creator */
            public static final class Creator implements Parcelable.Creator<C0590OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final C0590OTHER createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C0590OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final C0590OTHER[] newArray(int i10) {
                    return new C0590OTHER[i10];
                }
            }

            private C0590OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ OTHER(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private OTHER(String str) {
            super(str, LinkAccountType.OTHER.INSTANCE, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$UNKNOWN;", "Lcom/plaid/link/result/LinkAccountSubtype;", "name", "", "type", "Lcom/plaid/link/result/LinkAccountType;", "(Ljava/lang/String;Lcom/plaid/link/result/LinkAccountType;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/plaid/link/result/LinkAccountType;", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkAccountSubtype {

        @NotNull
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();

        @NotNull
        private final String name;

        @NotNull
        private final LinkAccountType type;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UNKNOWN createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UNKNOWN(parcel.readString(), (LinkAccountType) parcel.readParcelable(UNKNOWN.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UNKNOWN[] newArray(int i10) {
                return new UNKNOWN[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(@NotNull String name, @NotNull LinkAccountType type) {
            super(name, type, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.type = type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(UNKNOWN.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.plaid.link.result.LinkAccountSubtype.UNKNOWN");
            UNKNOWN unknown = (UNKNOWN) other;
            return Intrinsics.areEqual(this.name, unknown.name) && Intrinsics.areEqual(this.type, unknown.type);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final LinkAccountType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.name.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeParcelable(this.type, flags);
        }
    }

    public /* synthetic */ LinkAccountSubtype(String str, LinkAccountType linkAccountType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkAccountType);
    }

    @NotNull
    public final LinkAccountType getAccountType() {
        return this.accountType;
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    private LinkAccountSubtype(String str, LinkAccountType linkAccountType) {
        this.json = str;
        this.accountType = linkAccountType;
    }

    public /* synthetic */ LinkAccountSubtype(String str, LinkAccountType linkAccountType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? new LinkAccountType.UNKNOWN("") : linkAccountType, null);
    }
}
