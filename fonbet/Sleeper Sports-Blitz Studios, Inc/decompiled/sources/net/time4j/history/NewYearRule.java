package net.time4j.history;

/* loaded from: classes10.dex */
public enum NewYearRule {
    BEGIN_OF_JANUARY { // from class: net.time4j.history.NewYearRule.1
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            return HistoricDate.of(historicEra, i, 1, 1);
        }

        @Override // net.time4j.history.NewYearRule
        int displayedYear(NewYearStrategy newYearStrategy, HistoricDate historicDate) {
            return historicDate.getYearOfEra();
        }
    },
    BEGIN_OF_MARCH { // from class: net.time4j.history.NewYearRule.2
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            return HistoricDate.of(historicEra, i, 3, 1);
        }
    },
    BEGIN_OF_SEPTEMBER { // from class: net.time4j.history.NewYearRule.3
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            return HistoricDate.of(historicEra, i - 1, 9, 1);
        }

        @Override // net.time4j.history.NewYearRule
        int displayedYear(NewYearStrategy newYearStrategy, HistoricDate historicDate) {
            HistoricEra era = historicDate.getEra();
            int yearOfEra = historicDate.getYearOfEra();
            int i = yearOfEra + 1;
            return historicDate.compareTo(newYearStrategy.newYear(era, i)) >= 0 ? i : yearOfEra;
        }
    },
    CHRISTMAS_STYLE { // from class: net.time4j.history.NewYearRule.4
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            return HistoricDate.of(historicEra, i - 1, 12, 25);
        }

        @Override // net.time4j.history.NewYearRule
        int displayedYear(NewYearStrategy newYearStrategy, HistoricDate historicDate) {
            int yearOfEra = historicDate.getYearOfEra();
            int i = yearOfEra + 1;
            return historicDate.compareTo(newYearStrategy.newYear(historicDate.getEra(), i)) >= 0 ? i : yearOfEra;
        }
    },
    EASTER_STYLE { // from class: net.time4j.history.NewYearRule.5
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            int i2;
            int marchDay = Computus.EASTERN.marchDay(historicEra.annoDomini(i));
            int i3 = marchDay - 1;
            if (i3 > 31) {
                i3 = marchDay - 32;
                i2 = 4;
            } else {
                i2 = 3;
            }
            return HistoricDate.of(historicEra, i, i2, i3);
        }
    },
    GOOD_FRIDAY { // from class: net.time4j.history.NewYearRule.6
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            int i2;
            int marchDay = Computus.EASTERN.marchDay(historicEra.annoDomini(i));
            int i3 = marchDay - 2;
            if (i3 > 31) {
                i3 = marchDay - 33;
                i2 = 4;
            } else {
                i2 = 3;
            }
            return HistoricDate.of(historicEra, i, i2, i3);
        }
    },
    MARIA_ANUNCIATA { // from class: net.time4j.history.NewYearRule.7
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            return HistoricDate.of(historicEra, i, 3, 25);
        }
    },
    CALCULUS_PISANUS { // from class: net.time4j.history.NewYearRule.8
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            return MARIA_ANUNCIATA.newYear(historicEra, i + 1);
        }

        @Override // net.time4j.history.NewYearRule
        int displayedYear(NewYearStrategy newYearStrategy, HistoricDate historicDate) {
            int yearOfEra = historicDate.getYearOfEra();
            int i = yearOfEra - 1;
            return historicDate.compareTo(newYear(historicDate.getEra(), i)) < 0 ? yearOfEra - 2 : i;
        }

        @Override // net.time4j.history.NewYearRule
        int standardYear(boolean z, NewYearStrategy newYearStrategy, HistoricEra historicEra, int i, int i2, int i3) {
            return MARIA_ANUNCIATA.standardYear(z, newYearStrategy, historicEra, i + 1, i2, i3);
        }
    },
    EPIPHANY { // from class: net.time4j.history.NewYearRule.9
        @Override // net.time4j.history.NewYearRule
        HistoricDate newYear(HistoricEra historicEra, int i) {
            return HistoricDate.of(historicEra, i, 1, 6);
        }
    };

    private static final int COUNCIL_OF_TOURS = 567;

    abstract HistoricDate newYear(HistoricEra historicEra, int i);

    public NewYearStrategy until(int i) {
        if (i <= COUNCIL_OF_TOURS) {
            throw new IllegalArgumentException("Defining New-Year-strategy is not supported before Council of Tours in AD 567.");
        }
        NewYearStrategy newYearStrategy = new NewYearStrategy(this, i);
        NewYearRule newYearRule = BEGIN_OF_JANUARY;
        return this != newYearRule ? new NewYearStrategy(newYearRule, COUNCIL_OF_TOURS).and(newYearStrategy) : newYearStrategy;
    }

    int displayedYear(NewYearStrategy newYearStrategy, HistoricDate historicDate) {
        int yearOfEra = historicDate.getYearOfEra();
        return historicDate.compareTo(newYear(historicDate.getEra(), yearOfEra)) < 0 ? yearOfEra - 1 : yearOfEra;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r7.compareTo2(r6) >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r9 > r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r5 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid date due to changing new year rule (year too short to cover month and day-of-month): " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r2.compareTo2(r6) >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int standardYear(boolean z, NewYearStrategy newYearStrategy, HistoricEra historicEra, int i, int i2, int i3) {
        int i4;
        if (i2 >= 5 && i2 <= 8) {
            return i;
        }
        HistoricDate newYear = newYear(historicEra, i);
        int i5 = i + 1;
        HistoricDate newYear2 = newYearStrategy.newYear(historicEra, i5);
        HistoricDate of = HistoricDate.of(historicEra, i, i2, i3);
        if (i2 <= 4) {
            HistoricDate of2 = HistoricDate.of(historicEra, i5, i2, i3);
            i4 = of.compareTo(newYear) >= 0 ? i : i5;
        } else {
            i5 = i - 1;
            i4 = HistoricDate.of(historicEra, i5, i2, i3).compareTo(newYear) >= 0 ? i5 : i;
        }
    }
}
